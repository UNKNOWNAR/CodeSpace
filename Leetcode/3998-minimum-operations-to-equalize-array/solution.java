class Solution {
    public int minOperations(int[] nums) {
        int prev = nums[0];
        for(int val:nums){
            if(prev!=val)
                return 1;
            prev = val;
        }
        return 0;
    }
}
