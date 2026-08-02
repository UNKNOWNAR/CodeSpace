class Solution {
public:
    int solve(int l,int r,vector<int>& piles,vector<vector<int>>& dp){
        if(dp[l][r]!=-1)
            return dp[l][r];
        if(l==r)    return 0;
        int score = piles[l]-solve(l+1,r,piles,dp);
        score = max(score,piles[r]-solve(l,r-1,piles,dp));
        return dp[l][r] = score;
    }
    bool stoneGame(vector<int>& piles) {
        vector<vector<int>> dp(piles.size(),vector<int>(piles.size(),-1));
        return solve(0,piles.size()-1,piles,dp)>0;
    }
};