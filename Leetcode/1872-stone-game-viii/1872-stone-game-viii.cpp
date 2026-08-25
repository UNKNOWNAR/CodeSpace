class Solution {
public:
    int stoneGameVIII(vector<int>& stones) {
        int n = stones.size();
        vector<int> prefix_Sum(n,0);
        vector<int> dp(n,-1);
        prefix_Sum[0] = stones[0];
        for(int i=1;i<n;i++)
            prefix_Sum[i] += prefix_Sum[i-1]+stones[i];
        dp[n-1] = prefix_Sum[n-1];
        for(int i=n-2;i>=1;i--){
            int take = prefix_Sum[i]-dp[i+1];
            int skip = dp[i+1];
            dp[i] = max(take,skip);
        }
        return dp[1];
    }
};