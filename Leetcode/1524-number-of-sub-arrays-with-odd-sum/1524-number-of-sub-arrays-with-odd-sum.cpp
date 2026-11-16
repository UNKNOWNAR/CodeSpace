class Solution {
public:
    int mod = 1e9+7;
    int numOfSubarrays(vector<int>& arr) {
        int evenCount = 0, oddCount = 0, n = arr.size(),sum = 0,count = 0;
        vector<vector<int>> dp(n+1,vector<int>(2,0));
        for(int i=0;i<n;i++){
            int p = arr[i] & 1;
            count = (count + dp[i][!p] + p) % mod;
            dp[i + 1][p]  = (1 + dp[i][0]) % mod; 
            dp[i + 1][!p] = dp[i][1];
        }
        return count;
    }
};