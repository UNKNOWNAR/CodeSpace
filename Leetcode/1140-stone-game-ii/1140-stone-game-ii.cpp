class Solution {
public:
    int n;
    int stoneGameII(vector<int>& piles) {
        n = piles.size();
        vector<vector<vector<int>>> dp(n,vector<vector<int>>(2*n,vector<int>(2,-1)));
        return solve(0,1,0,piles,dp);
    }
    int solve(int indx,int M,int moves,vector<int>& piles,vector<vector<vector<int>>> &dp){
        if(indx>=n)
            return 0;
        if(dp[indx][M][moves]!=-1)
            return dp[indx][M][moves];
        int points = 0;
        if(!moves){//Alice try to maximze her points
            int sum = 0;
            for(int i=indx;i<min(n,indx+2*M);i++){
                sum += piles[i];
                points = max(points,(moves==0?sum:0)+solve(i+1,max(i-indx+1,M),1,piles,dp));
            }
        }
        else{
            points = 1e9;
            for(int i=indx;i<min(n,indx+2*M);i++)
                points = min(points,solve(i+1,max(i-indx+1,M),0,piles,dp));
        }
        return dp[indx][M][moves] = points;
    }
};