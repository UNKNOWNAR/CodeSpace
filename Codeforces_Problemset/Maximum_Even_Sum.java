package CodeForces.contset.Round1047_Div3;

import java.io.*;
import java.util.*;

public class Maximum_Even_Sum {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        t = sc.nextInt(); // Uncomment this line for multiple test cases
        while (t-- > 0) {
            solve(sc, out);
        }
        out.flush();
    }

    public static void solve(FastReader sc, PrintWriter out) {
        long a = sc.nextLong();
        long b = sc.nextLong();
        long sum = (a + b) % 2 == 0 ? a + b : 0;

        for (long k = 1; k * k <= b; k++) {
            if (b % k == 0) {
                long d1 = k;
                long d2 = b / k;

                if ((a * d1 + d2) % 2 == 0)
                    sum = Math.max(sum, a * d1 + d2);

                if ((a * d2 + d1) % 2 == 0)
                    sum = Math.max(sum, a * d2 + d1);
            }
        }

        if (sum % 2 == 0 && sum > 0)
            out.println(sum);
        else
            out.println(-1);
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
                    st = new StringTokenizer(br.readLine());
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
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}