class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int minAbs = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0&&k>0){
                nums[i] = -1*nums[i];
                k--;
            }
            minAbs = Math.min(Math.abs(nums[i]),minAbs);
            sum += nums[i];
        }
        if((k&1)==1)
            return sum-2*minAbs;
        return sum;
    }
}
