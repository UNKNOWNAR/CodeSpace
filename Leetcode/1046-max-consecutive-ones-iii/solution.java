class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0,maxLen = 0, r = 0, n0 = 0,n = nums.length;
        while(r<n){
            if(nums[r]==0)
                n0++;
            if(n0>k){
                if(nums[l]==0)  n0--;
                l++;
            }
            if(n0<=k)
                maxLen = Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}
