class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(0,nums,dp);
    }
    public int helper(int indx,int[] nums,int[] dp){
        if(indx==nums.length-1)
            return nums[indx];
        if(indx==nums.length)
            return 0;
        if(dp[indx]!=-1)
            return dp[indx];
        int pick = nums[indx] + helper(indx+2,nums,dp);
        int notPick = helper(indx+1,nums,dp);
        dp[indx] = Math.max(pick,notPick);
        return dp[indx];
    }
}
