class Solution {
    public int longestSubsequence(int[] nums) {
        int sum = 0;
        for(int num:nums)
            sum = sum^num;
        if(sum!=0)
            return nums.length;
        for (int num : nums) {
            if (num != 0) {
                return nums.length - 1;
            }
        }
        return 0;
    }
}
