class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1||k>nums.length)
            return 0;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[k-1];
        int ans = max-min;
        for(int i=k;i<nums.length;i++){
            min = nums[i-k+1];
            max = nums[i];
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
}
