class Solution {
     static int maxCoins(int i, int j, int[] a, int[][] dp) {
        if (i > j) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int maxi = Integer.MIN_VALUE;

        for (int ind = i; ind <= j; ind++) {
            int cost = a[i - 1] * a[ind] * a[j + 1]
                     + maxCoins(i, ind - 1, a, dp)
                     + maxCoins(ind + 1, j, a, dp);
            maxi = Math.max(maxi, cost);
        }

        return dp[i][j] = maxi;
    }
    public int maxCoins(int[] a) {

        int n = a.length;
        int[] arr = new int[n + 2];
        arr[0] = 1;  // Add 1 at the beginning
        for (int i = 0; i < n; i++) arr[i + 1] = a[i];
        arr[n + 1] = 1;  // Add 1 at the end

        int[][] dp = new int[n + 2][n + 2];
        for (int[] row : dp) Arrays.fill(row, -1);

        return maxCoins(1, n, arr, dp);

        /*int n = a.length;

        // Create a new array with 1 at the beginning and end
        int[] arr = new int[n + 2];
        arr[0] = 1;
        for (int i = 0; i < n; i++) arr[i + 1] = a[i];
        arr[n + 1] = 1;

        int[][] dp = new int[n + 2][n + 2];

        // Fill DP table
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n; j++) {
                if (i > j) continue;

                int maxi = Integer.MIN_VALUE;

                for (int ind = i; ind <= j; ind++) {
                    int cost = arr[i - 1] * arr[ind] * arr[j + 1] +
                               dp[i][ind - 1] + dp[ind + 1][j];
                    maxi = Math.max(maxi, cost);
                }

                dp[i][j] = maxi;
            }
        }

        return dp[1][n];*/

        
    }
}
