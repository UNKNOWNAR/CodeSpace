class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int m = Math.min(nums1.length,nums2.length),n = Math.max(nums1.length,nums2.length);
        int dp[] = new int[m+1];
        int maxLen = 0;
        for(int i=0;i<n;i++){
            for(int j=m;j>0;j--){
                if(nums1[i]==nums2[j-1])
                    dp[j] = 1+dp[j-1];
                else
                    dp[j] = 0;
                maxLen = Math.max(dp[j],maxLen);
            }
        }
        return maxLen;
    }
}
