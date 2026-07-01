import java.util.Arrays;

class Solution {
    int n;
    long[][][][] memo; // The DP array requested
    int MOD = 1_000_000_007;

    public int numOfWays(int n) {
        this.n = n;
        
        // dp[idx][prev1][prev2][prev3]
        // Dimensions: [n][4][4][4]
        // We use size 4 to handle colors 0, 1, 2, plus '3' representing "No Color" (for the very first row)
        memo = new long[n][4][4][4];
        
        // Initialize DP array with -1
        for (long[][][] m1 : memo) {
            for (long[][] m2 : m1) {
                for (long[] m3 : m2) {
                    Arrays.fill(m3, -1);
                }
            }
        }

        // Start from row 0, with "previous row" colors as 3 (dummy value)
        return (int) solve(0, 3, 3, 3);
    }

    // Function to color rows from 'rowIdx' to n-1
    // p1, p2, p3 are the colors of the PREVIOUS row (rowIdx - 1)
    public long solve(int rowIdx, int p1, int p2, int p3) {
        // Base Case: If we filled all rows successfully
        if (rowIdx == n) return 1;

        // Memoization Check
        if (memo[rowIdx][p1][p2][p3] != -1) {
            return memo[rowIdx][p1][p2][p3];
        }

        long ways = 0;

        // Try all valid colors for the CURRENT row: c1, c2, c3
        // Loop for 1st column (c1)
        for (int c1 = 0; c1 < 3; c1++) {
            if (c1 == p1) continue; // Vertical check

            // Loop for 2nd column (c2)
            for (int c2 = 0; c2 < 3; c2++) {
                if (c2 == p2) continue; // Vertical check
                if (c2 == c1) continue; // Horizontal check

                // Loop for 3rd column (c3)
                for (int c3 = 0; c3 < 3; c3++) {
                    if (c3 == p3) continue; // Vertical check
                    if (c3 == c2) continue; // Horizontal check

                    // Valid row formed (c1, c2, c3), move to next row
                    ways = (ways + solve(rowIdx + 1, c1, c2, c3)) % MOD;
                }
            }
        }

        // Store result in DP array and return
        return memo[rowIdx][p1][p2][p3] = ways;
    }
}
