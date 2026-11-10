class Solution {
public:
    int n;
    int climbStairs(int n, vector<int>& costs) {
        this->n = n;
        vector<int> dp(n+1);
        for(int i=n-1;i>=0;i--){
            dp[i] = 1e9;
            for(int j=i+1;j<=min(n,i+3);j++)
                dp[i] = min(dp[i],costs[j-1]+(j-i)*(j-i)+dp[j]);
        }
        return dp[0];
    }
};