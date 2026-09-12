class Solution {
public:
    int minDays(int n) {
        int max_num = sqrt(2*n);
        vector<int> prefixSum(max_num+1);
        for(int i=1;i<=max_num;i++)
            prefixSum[i] = i+prefixSum[i-1];
        vector<int> dp(n+1,1e9);
        dp[0] = 0;
        for (int i = 1; i <= max_num; i++) {
            int weight = prefixSum[i];
            int cost = i + 1;
            for (int k = weight; k <= n; k++) {
                int take=1e9;
                if(dp[k - weight] != 1e9)
                    dp[k] = min(dp[k],dp[k-weight]+cost);
            }
        }
        return dp[n]-1;
    }
};