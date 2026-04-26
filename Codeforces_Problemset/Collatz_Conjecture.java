package CodeForces.contset.Round1047_Div3;

import java.io.*;
import java.util.*;

/**
 * Solution for:
 * Problem:
 * Contest:
 * Link:
 *
 * @author UnknownAR
 * @date 07-09-2025
 */
public class Collatz_Conjecture {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = sc.nextInt(); // Uncomment this line for multiple test cases
        while (t-- > 0) {
            solve(sc, out);
        }

        out.close();
    }

    public static void solve(FastReader sc, PrintWriter out) {
        // Your logic goes here
        int k = sc.nextInt();
        int x = sc.nextInt();
        out.println(Output(x, k));
    }

    public static int Output(int x, int k) {
        if (k == 0)
            return x;
        int ans = 0;
        if ((x - 1) % 3 == 0 && ((x - 1) / 3) % 2 != 0)
            ans = Output((x - 1) / 3, k - 1);
        if (ans > 0)
            return ans;
        return Output(x * 2, k - 1);
    }

    // Fast I/O Template
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) { // Handles end of file
                        return null;
                    }
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}