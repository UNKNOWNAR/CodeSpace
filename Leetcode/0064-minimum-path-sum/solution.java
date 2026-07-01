class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // A 1D array to store the results of the previous row
        int[] dp = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // For the very first cell
                if (i == 0 && j == 0) {
                    dp[j] = grid[i][j];
                }
                // For the first row, can only come from the left
                else if (i == 0) {
                    dp[j] = grid[i][j] + dp[j - 1];
                }
                // For the first column, can only come from above
                else if (j == 0) {
                    dp[j] = grid[i][j] + dp[j];
                }
                // For all other cells, take the minimum from above or the left
                else {
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j - 1]);
                }
            }
        }

        // The final answer is the last element in the dp array
        return dp[n - 1];
    }
}
