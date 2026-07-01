class Solution {
    Long dp[][];
    public long rob(int[] nums, int[] colors) {
        dp = new Long[nums.length][2];
        return helper(nums,colors,0,0);
    }
    private long helper(int nums[],int colors[],int indx,int prevRobbed){
        if(indx==nums.length)
            return 0;
        if(dp[indx][prevRobbed]!=null)
            return dp[indx][prevRobbed];
        int ans=0;
        if(prevRobbed==1&&colors[indx]==colors[indx-1])
            return helper(nums,colors,indx+1,0);
        return dp[indx][prevRobbed] = Math.max((long)nums[indx]+helper(nums,colors,indx+1,1),helper(nums,colors,indx+1,0));
    }
}
