class Solution {
    int n;
    long dp[][];
    public long minIncrease(int[] nums) {
        n = nums.length;
        dp = new long[n][2];
        for(long arr[]:dp)
            Arrays.fill(arr,-1);
        if(n%2!=0) return count(1,0,nums);
        return count(1,1,nums);
    }
    public long count(int indx,int skip,int nums[]){
        if(indx>=n-1)
            return 0;
        if(dp[indx][skip]!=-1)
            return dp[indx][skip];
        long minCount=0;
        if(!(nums[indx]>nums[indx-1]&&nums[indx]>nums[indx+1]))
            minCount = (long)Math.max(nums[indx-1],nums[indx+1])+1-nums[indx];
        minCount += count(indx+2,skip,nums);
        if(skip==1)
            minCount = Math.min(minCount,count(indx+1,0,nums));
        return dp[indx][skip] = minCount;
    }
}
