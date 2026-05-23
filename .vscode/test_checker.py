import os
import sys


def main():
    if len(sys.argv) < 3:
        print("Usage: python3 test_checker.py <expected_file> <output_file>")
        sys.exit(1)

    expected_file = os.path.normpath(sys.argv[1])
    output_file = os.path.normpath(sys.argv[2])

    if not os.path.exists(expected_file):
        print(f"\033[91mError: Expected output file not found at {expected_file}. Please create it.\033[0m")
        sys.exit(1)

    if not os.path.exists(output_file):
        print(f"\033[91mError: Output file not found at {output_file}\033[0m")
        sys.exit(1)

    with open(expected_file, 'r') as f:
        expected = [line.strip() for line in f if line.strip()]
    with open(output_file, 'r') as f:
        actual = [line.strip() for line in f if line.strip()]

    max_len = max(len(expected), len(actual))

    passed = 0
    failed = 0

    print("\033[96m========================================\033[0m")
    print("\033[96m          TEST CASE COMPARISON          \033[0m")
    print("\033[96m========================================\033[0m")

    for i in range(max_len):
        exp = expected[i].strip() if i < len(expected) else "<EOF>"
        act = actual[i].strip() if i < len(actual) else "<EOF>"

        if exp == act:
            passed += 1
        else:
            failed += 1
            print(f"\033[91mTest Case / Line {i + 1} FAILED:\033[0m")
            print(f"\033[92m  Expected: {exp}\033[0m")
            print(f"\033[93m  Actual  : {act}\033[0m")
            print("----------------------------------------")

    print(f"Total Cases:  {max_len}")
    print(f"\033[92mPassed:       {passed}\033[0m")
    if failed > 0:
        print(f"\033[91mFailed:       {failed}\033[0m")
        print("\033[91mSOME TESTS FAILED! X\033[0m")
    else:
        print(f"\033[92mFailed:       {failed}\033[0m")
        print("\033[92mALL TESTS PASSED! O\033[0m")


if __name__ == "__main__":
    main()
