import os
import sys
import subprocess
import time
import threading
import queue


def run_with_realtime_output(cmd, stdin_path, stdout_path, timeout=3.0):
    start_time = time.time()
    
    with open(stdin_path, 'r') as fin, open(stdout_path, 'w') as fout:
        proc = subprocess.Popen(
            cmd,
            stdin=fin,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True,
            bufsize=1
        )
        
        q = queue.Queue()
        
        def read_stream(stream, name):
            try:
                for line in stream:
                    q.put((name, line))
            except Exception:
                pass
            finally:
                try:
                    stream.close()
                except Exception:
                    pass
            
        t_out = threading.Thread(target=read_stream, args=(proc.stdout, 'stdout'))
        t_err = threading.Thread(target=read_stream, args=(proc.stderr, 'stderr'))
        t_out.daemon = True
        t_err.daemon = True
        t_out.start()
        t_err.start()
        
        while True:
            elapsed = time.time() - start_time
            if elapsed > timeout:
                proc.terminate()
                proc.wait()
                raise subprocess.TimeoutExpired(cmd, timeout)
            
            try:
                # Check for output with a short timeout to keep checking the main loop
                stream_name, line = q.get(timeout=0.05)
                if stream_name == 'stdout':
                    fout.write(line)
                    fout.flush()
                else:
                    sys.stderr.write(line)
                    sys.stderr.flush()
            except queue.Empty:
                if proc.poll() is not None:
                    break
        
        # Read any leftover items from the queue
        while not q.empty():
            try:
                stream_name, line = q.get_nowait()
                if stream_name == 'stdout':
                    fout.write(line)
                    fout.flush()
                else:
                    sys.stderr.write(line)
                    sys.stderr.flush()
            except queue.Empty:
                break
                
        return proc.poll()


def main():
    if len(sys.argv) < 3:
        print("Usage: python3 run_cp.py <source_file> <workspace_folder>")
        sys.exit(1)

    file_path = os.path.normpath(sys.argv[1])
    workspace_dir = os.path.normpath(sys.argv[2])

    file_dir = os.path.dirname(file_path)
    base_name = os.path.splitext(os.path.basename(file_path))[0]
    ext = os.path.splitext(file_path)[1].lower()
    is_win = os.name == "nt"

    input_file = os.path.join(workspace_dir, "input.txt")
    output_file = os.path.join(workspace_dir, "output.txt")

    if ext == ".cpp":
        exe_path = os.path.join(file_dir, base_name + (".exe" if is_win else ""))

        unbuffer_header = os.path.join(workspace_dir, ".vscode", "unbuffer.h")
        compile_cmd = ['g++', '-std=c++20']
        if os.path.exists(unbuffer_header):
            compile_cmd += ['-include', unbuffer_header]
        compile_cmd += [file_path, '-o', exe_path]

        print(f"Compiling: {os.path.basename(file_path)}")
        result = subprocess.run(compile_cmd)
        if result.returncode != 0:
            print("Compilation failed!")
            sys.exit(1)

        print("Running...")
        start_time = time.time()
        try:
            returncode = run_with_realtime_output([exe_path], input_file, output_file, timeout=3.0)
            time_taken = time.time() - start_time
            print(f"\nExecution completed in {time_taken:.4f} seconds.")

            # Cleanup
            try:
                os.remove(exe_path)
            except OSError:
                pass

            if returncode != 0:
                print(f"Runtime error (exit code {returncode})")
                sys.exit(1)
            else:
                print("Done! Output written to output.txt")

        except subprocess.TimeoutExpired:
            time_taken = time.time() - start_time
            print(f"\nTime Limit Exceeded (TLE) warning! Execution took more than {time_taken:.4f} seconds.")
            with open(output_file, 'a') as fout:
                fout.write("\n[TLE] Time Limit Exceeded (> 3s)\n")
            
            # Cleanup
            try:
                os.remove(exe_path)
            except OSError:
                pass
            sys.exit(1)

    elif ext == ".java":
        compile_cmd = ['javac', file_path]
        print(f"Compiling: {os.path.basename(file_path)}")
        result = subprocess.run(compile_cmd)
        if result.returncode != 0:
            print("Compilation failed!")
            sys.exit(1)

        print("Running...")
        start_time = time.time()
        try:
            returncode = run_with_realtime_output(['java', '-cp', file_dir, base_name], input_file, output_file, timeout=3.0)
            time_taken = time.time() - start_time
            print(f"\nExecution completed in {time_taken:.4f} seconds.")

            # Cleanup .class files
            import glob
            for f in glob.glob(os.path.join(file_dir, base_name + "*.class")):
                try:
                    os.remove(f)
                except OSError:
                    pass

            if returncode != 0:
                print(f"Runtime error (exit code {returncode})")
                sys.exit(1)
            else:
                print("Done! Output written to output.txt")

        except subprocess.TimeoutExpired:
            time_taken = time.time() - start_time
            print(f"\nTime Limit Exceeded (TLE) warning! Execution took more than {time_taken:.4f} seconds.")
            with open(output_file, 'a') as fout:
                fout.write("\n[TLE] Time Limit Exceeded (> 3s)\n")
            
            # Cleanup .class files
            import glob
            for f in glob.glob(os.path.join(file_dir, base_name + "*.class")):
                try:
                    os.remove(f)
                except OSError:
                    pass
            sys.exit(1)

    else:
        print(f"Unsupported file type: {ext}")
        sys.exit(1)


if __name__ == "__main__":
    main()
