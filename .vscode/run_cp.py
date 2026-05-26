import os
import sys
import subprocess
import time


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

        compile_cmd = ['g++', '-std=c++17', file_path, '-o', exe_path]
        print(f"Compiling: {os.path.basename(file_path)}")
        result = subprocess.run(compile_cmd)
        if result.returncode != 0:
            print("Compilation failed!")
            sys.exit(1)

        print("Running...")
        start_time = time.time()
        try:
            with open(input_file, 'r') as fin, open(output_file, 'w') as fout:
                result = subprocess.run([exe_path], stdin=fin, stdout=fout, timeout=3.0)
            
            time_taken = time.time() - start_time
            print(f"Execution completed in {time_taken:.4f} seconds.")

            # Cleanup
            try:
                os.remove(exe_path)
            except OSError:
                pass

            if result.returncode != 0:
                print(f"Runtime error (exit code {result.returncode})")
                sys.exit(1)
            else:
                print("Done! Output written to output.txt")

        except subprocess.TimeoutExpired:
            time_taken = time.time() - start_time
            print(f"Time Limit Exceeded (TLE) warning! Execution took more than {time_taken:.4f} seconds.")
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
            with open(input_file, 'r') as fin, open(output_file, 'w') as fout:
                result = subprocess.run(['java', '-cp', file_dir, base_name], stdin=fin, stdout=fout, timeout=3.0)
            
            time_taken = time.time() - start_time
            print(f"Execution completed in {time_taken:.4f} seconds.")

            # Cleanup .class files
            import glob
            for f in glob.glob(os.path.join(file_dir, base_name + "*.class")):
                try:
                    os.remove(f)
                except OSError:
                    pass

            if result.returncode != 0:
                print(f"Runtime error (exit code {result.returncode})")
                sys.exit(1)
            else:
                print("Done! Output written to output.txt")

        except subprocess.TimeoutExpired:
            time_taken = time.time() - start_time
            print(f"Time Limit Exceeded (TLE) warning! Execution took more than {time_taken:.4f} seconds.")
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
