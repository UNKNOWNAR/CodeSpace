class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[] = new int[arr.length+1];
        for(int indx=arr.length-1;indx>=0;indx--){
            int max = 0;
            int maxSum = 0;
            for(int j=indx;j<Math.min(arr.length,indx+k);j++){
                max = Math.max(arr[j],max);
                int sum = max*(j-indx+1)+dp[j+1];
                maxSum = Math.max(maxSum,sum);
            }
            dp[indx]=maxSum;
        }
        return dp[0];
    }
}
