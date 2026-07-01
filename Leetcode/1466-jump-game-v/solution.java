class Solution {
    int dp[];
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        int ans = 1;
        for(int i=0;i<n;i++)
            ans = Math.max(ans,maxmCount(i,arr,d));
        return ans;
    }
    private int maxmCount(int indx,int arr[],int d){
        if(dp[indx]!=-1)
            return dp[indx];
        int ans = 1;
        int left = Math.max(0,indx-d);
        for(int i=indx-1;i>=left;i--){
            if(arr[i]>=arr[indx])
                break;
            ans = Math.max(ans,1+maxmCount(i,arr,d));
        }
        int right = Math.min(arr.length-1,indx+d);
        for(int i=indx+1;i<=right;i++){
            if(arr[i]>=arr[indx])
                break;
            ans = Math.max(ans,1+maxmCount(i,arr,d));
        }
        return dp[indx] = ans;
    }
}
