class Solution {
    public int minimumPrefixLength(int[] nums) {
        int start = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1])
                start = i+1;
        }
        return start;
    }
}
