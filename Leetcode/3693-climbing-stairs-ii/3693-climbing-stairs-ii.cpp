class Solution {
public:
    int n;
    int climbStairs(int n, vector<int>& costs) {
        this->n = n;
        vector<int> dp(n+1,-1);
        return solve(0,costs,dp);
    }
    int solve(int i,vector<int>& costs,vector<int>& dp){
        if(i==n)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int minmCost = 1e9;
        for(int j=i+1;j<=min(n,i+3);j++)
            minmCost = min(minmCost,costs[j-1]+(j-i)*(j-i)+solve(j,costs,dp));
        return dp[i] = minmCost;
    }
};