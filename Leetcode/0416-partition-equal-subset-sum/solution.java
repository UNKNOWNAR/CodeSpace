class Solution {
    public boolean canPartition(int[] nums) {
        int sol = 0;
        for (int num : nums) sol += num;
        if (sol % 2 != 0) return false;
        int target = sol / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int current = target; current >= num; current--) {
                dp[current] = dp[current] || dp[current - num];
                if (dp[target]) return true;
            }
        }
        return dp[target]; 
    }
}
