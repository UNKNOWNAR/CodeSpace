class Solution {
    public int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int temp1[] = new int[nums.length-1];
        int temp2[] = new int[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(i>0)
                temp1[i-1] = nums[i];
            if(i<nums.length-1)
                temp2[i] = nums[i];
        }
        int dp[] = new int[nums.length-1];
        int dp1[] = new int[nums.length-1];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);
        return Math.max(helper(0,temp1,dp),helper(0,temp2,dp1));
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
