class Solution {
    public long maximumScore(int[] nums) {
        long prefixSum[] = new long[nums.length];
        int suffixMin[] = new int[nums.length];
        
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++)
            prefixSum[i] = prefixSum[i-1]+nums[i];
        
        suffixMin[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
            suffixMin[i] = Math.min(suffixMin[i+1],nums[i]);
        
        long maxScore = Long.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
            maxScore = Math.max(maxScore,prefixSum[i]-suffixMin[i+1]);
        return maxScore;
    }
}
