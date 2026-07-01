class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE;
        double ksum = 0;
        for(int i=0;i<k;i++)
            ksum += nums[i];
        ans = Math.max(ans,ksum);
        for(int i=k;i<nums.length;i++){
            ksum += nums[i];
            ksum -= nums[i-k];
            ans = Math.max(ans,ksum);
        }
        return ans/k;
    }
}
