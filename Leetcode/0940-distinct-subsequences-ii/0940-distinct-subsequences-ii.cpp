class Solution {
public:
    int mod = 1e9+7;
    vector<int> dp;
    vector<int> prev;
    int distinctSubseqII(string s) {
        int n = s.size();
        dp.assign(n+1,-1);
        prev.assign(n+1,0);
        vector<int> lastSeen(26,0);
        for(int i=1;i<=n;i++){
            int idx = s[i-1]-'a';
            prev[i] = lastSeen[idx];
            lastSeen[idx] = i;
        }
        return (solve(n)-1+mod)%mod;
    }
    int solve(int n){
        if(n==0)
            return 1;
        if(dp[n]!=-1)
            return dp[n];
        int total = (2*solve(n-1))%mod;
        if(prev[n] != 0){
            int duplicates = solve(prev[n]-1);
            total = (total-duplicates+mod)%mod;
        }
        return dp[n] = total;
    }
};