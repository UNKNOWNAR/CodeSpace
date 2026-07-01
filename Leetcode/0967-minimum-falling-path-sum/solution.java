import java.util.*;

class Solution {

    int findMinFalling(int i, int j, int m, int[][] matrix, int[][] dp) {
        if (j < 0 || j >= m) return (int) 1e9;  
        if (i == 0) return matrix[i][j];       

        if (dp[i][j] != (int) 1e9) return dp[i][j];

        int up = matrix[i][j] + findMinFalling(i - 1, j, m, matrix, dp);
        int left = matrix[i][j] + findMinFalling(i - 1, j - 1, m, matrix, dp);
        int right = matrix[i][j] + findMinFalling(i - 1, j + 1, m, matrix, dp);

        return dp[i][j] = Math.min(up, Math.min(left, right));
    }

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], (int) 1e9);
        }

        int minVal = (int) 1e9;
        for (int j = 0; j < m; j++) {
            int val = findMinFalling(n - 1, j, m, matrix, dp);
            minVal = Math.min(val, minVal);
        }

        return minVal;
    }
}
