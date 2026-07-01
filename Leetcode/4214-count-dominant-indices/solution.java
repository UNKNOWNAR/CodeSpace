class Solution {
    public int dominantIndices(int[] nums) {
        double n = nums.length;
        double sum = 0;
        for(int num:nums)
            sum += num;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            sum -= nums[i];
            n--;
            if(nums[i]>(sum/n))
                count++;
        }
        return count;
    }
}
