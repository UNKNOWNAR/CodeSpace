class Solution {
public:
    int distinctSubseqII(string s) {
        int n = s.size();
        int mod = 1e9+7;
        vector<int> dp(n+1,-1);
        vector<int> prev(n+1,0);
        vector<int> lastSeen(26,0);
        for(int i=1;i<=n;i++){
            int idx = s[i-1]-'a';
            prev[i] = lastSeen[idx];
            lastSeen[idx] = i;
        }
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            int total = (2*dp[i-1])%mod;
            if(prev[i]!=0){
                int duplicates = dp[prev[i]-1];
                total = (total-duplicates+mod)%mod;
            }
            dp[i] = total;
        }
        return (dp[n]-1+mod)%mod;
    }
};