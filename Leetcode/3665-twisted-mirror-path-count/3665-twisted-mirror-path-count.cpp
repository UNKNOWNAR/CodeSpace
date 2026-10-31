class Solution {
public: 
    int uniquePaths(vector<vector<int>>& grid) {
        int m = grid.size(),n = grid[0].size(),mod = 1e9+7;
        int dp[m][n][2];
        dp[m-1][n-1][0] = 1;
        dp[m-1][n-1][1] = 1;
        for(int r=m-1;r>=0;r--){
            for(int c=n-1;c>=0;c--){
                if(r==m-1&&c==n-1)
                    continue;
                for(int camefrom = 0;camefrom<=1;camefrom++){
                    int ways = 0;
                    if(grid[r][c]){
                         if(camefrom&&r<m-1)//came from left
                            ways = (ways+dp[r+1][c][!camefrom])%mod;
                        else if(!camefrom&&c<n-1)//came from up
                            ways = (ways+dp[r][c+1][!camefrom])%mod; 
                    }    
                    else{
                        if(r<m-1)
                            ways = (ways+dp[r+1][c][0])%mod;
                        if(c<n-1)
                            ways = (ways+dp[r][c+1][1])%mod;
                    }
                    dp[r][c][camefrom] = ways;
                }
            }
        }
        return dp[0][0][0];
    }
};