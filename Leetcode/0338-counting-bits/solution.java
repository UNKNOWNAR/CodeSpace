class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        
        // Base case dp[0] = 0 is implicitly set by new int[]
        for (int i = 1; i <= n; i++) {
            // i >> 1 is the number with the last bit removed/shifted
            // i & 1 adds 1 if the number is odd, 0 if even
            dp[i] = dp[i >> 1] + (i & 1);
        }
        
        return dp;
    }
}
