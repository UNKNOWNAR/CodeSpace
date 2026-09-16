class Solution {
    using ll = long long;
public:
    const int mod = 1e9+7;
    int n;
    int numberOfSets(int n, int k) {
        this->n = n;
        vector<vector<int>> dp(n+1,vector<int>(k+1,0));
        for(int i=0;i<=n;i++)
            dp[i][0] = 1;
        for(int j=1;j<=k;j++){
            vector<int> prevSum(n+1,0);
            for(int x=n-1;x>=0;x--)
                prevSum[x] = (prevSum[x+1]+dp[x][j-1])%mod;
            for(int i=n-1;i>=0;i--){
                dp[i][j] = prevSum[i+1]%mod;
                dp[i][j] = (dp[i][j]+dp[i+1][j])%mod;
            }
        }     
        return dp[0][k];
    }
};