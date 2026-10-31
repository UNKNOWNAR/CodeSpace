class Solution {
public: 
    int m,n,mod = 1e9+7;
    int dp[501][501][2];
    int uniquePaths(vector<vector<int>>& grid) {
        m = grid.size();
        n = grid[0].size();
        memset(dp,-1,sizeof(dp));
        return explore(grid,0,0,0);
    }
    int explore(vector<vector<int>>& grid,int r,int c,int camefrom){
        if(r<0||c<0||r==m||c==n)
            return 0;
        if(r==m-1&&c==n-1)
            return 1;
        if(dp[r][c][camefrom]!=-1)
            return dp[r][c][camefrom];
        int ways = 0;
        if(grid[r][c]){
            if(camefrom)//came from left
                ways = (ways+explore(grid,r+1,c,!camefrom))%mod;
            else//came from up
                ways = (ways+explore(grid,r,c+1,!camefrom))%mod;    
        }
        else{
            ways = (ways+explore(grid,r+1,c,0))%mod;
            ways = (ways+explore(grid,r,c+1,1))%mod;
        }
        return dp[r][c][camefrom] = ways;
    }
};