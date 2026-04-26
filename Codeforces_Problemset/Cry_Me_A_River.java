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
public class Cry_Me_A_River {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t = 1;
        // t = sc.nextInt(); // Uncomment this line for multiple test cases
        while (t-- > 0) {
            solve(sc, out);
        }

        out.close();
    }

    public static void solve(FastReader sc, PrintWriter out) {
        // Your logic goes here
        int n = sc.nextInt();//edges
        int m = sc.nextInt();
        int q = sc.nextInt();
        List<List<Integer>> path = new ArrayList<>();
        for (int i = 0; i < n; i++)
            path.add(new ArrayList<>());
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt()+1;
            int v = sc.nextInt()+1;
            path.get(u).add(v);
        }
        char edges[] = new char[n];
        Arrays.fill(edges, 'b');
        while (q-- > 0) {
            int choice = sc.nextInt();
            int u = sc.nextInt()+1;
            if(choice == 1)
                edges[u] = 'r';
        }
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