class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // --- Transformation Step with all necessary checks ---
        int diff = totalSum - target;
        if (diff < 0 || diff % 2 != 0) {
            return 0;
        }
        int subsetSumTarget = diff / 2;

        // --- DP to Count Subsets (Space-Optimized) ---
        // dp[j] = number of ways to form a sum of j
        int[] dp = new int[subsetSumTarget + 1];
        
        // Base case: There is one way to make a sum of 0 (the empty set)
        dp[0] = 1;

        for (int num : nums) {
            // Iterate backwards to use each number only once per combination
            for (int j = subsetSumTarget; j >= num; j--) {
                dp[j] = dp[j] + dp[j - num];
            }
        }

        return dp[subsetSumTarget];
    }
}
