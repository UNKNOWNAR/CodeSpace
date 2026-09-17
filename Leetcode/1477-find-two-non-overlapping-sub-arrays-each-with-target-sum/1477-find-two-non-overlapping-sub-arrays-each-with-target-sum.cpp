class Solution {
public:
    int minSumOfLengths(vector<int>& arr, int target) {
        int n = arr.size();
        vector<int> prefixSum(n);
        for(int i=0;i<n;i++)
            prefixSum[i] = arr[i]+(i>0?prefixSum[i-1]:0);
        vector<vector<int>> dp(n,vector<int>(3,-1));
        return solve(0,2,prefixSum,target,dp)==1e9?-1:solve(0,2,prefixSum,target,dp);
    }
    int solve(int indx,int count,vector<int>& prefixSum, int target,vector<vector<int>>& dp){
        if(count==0)
            return 0;
        if(indx==prefixSum.size())
            return 1e9;
        if(dp[indx][count]!=-1)
            return dp[indx][count];
        int target_val = target+(indx>0?prefixSum[indx-1]:0);
        int i = lower_bound(prefixSum.begin()+indx,prefixSum.end(),target_val)-prefixSum.begin();
        if(i==prefixSum.size())
            return dp[indx][count] = 1e9;
        int sum = prefixSum[i]-(indx>0?prefixSum[indx-1]:0);
        int ans= 1e9;
        if(sum==target)
            ans = i-indx+1+solve(i+1,count-1,prefixSum,target,dp);//take
        ans = min(ans,solve(indx+1,count,prefixSum,target,dp));//skip
        return dp[indx][count] = ans;
    }
};