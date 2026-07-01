class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        int prefixsum = 0;
        for(int i=0;i<nums.length;i++){
            if(2*prefixsum == sum-nums[i]) 
                return i;
            prefixsum += nums[i];
        }
        return -1;
    }
}
