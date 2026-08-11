class Solution {
public:
    bool solve(int n,vector<int>& dp){
        if(n==0)
            return false;
        if(dp[n]!=-1)
            return dp[n];
        bool win = false;
        for(int i=1;i*i<=n;i++){
            win |= !solve(n-i*i,dp);
            if(win)
                return dp[n] = win;
        }
        return dp[n] = win;
    }
    bool winnerSquareGame(int n) {
        vector<int> dp(n+1,-1);
        return solve(n,dp);
    }
};