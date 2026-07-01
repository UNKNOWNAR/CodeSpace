class Solution {
    public int longestSubarray(int[] nums) {
        int max = 2;
        for(int i=0;i<nums.length-2;i++){
            int temp = i;
            for(int j=i+2;j<nums.length;j++){
                if(nums[temp]+nums[temp+1]==nums[j]) {
                    max = Math.max(max, j - i + 1);
                    temp++;
                }
                else
                    break;
            }
        }
        return max;
    }
}
