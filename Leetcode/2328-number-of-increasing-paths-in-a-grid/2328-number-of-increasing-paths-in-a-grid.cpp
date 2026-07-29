class Solution {
public:
    int mod = 1e9+7,m,n;
    int countPaths(vector<vector<int>>& grid) {
        m = grid.size();
        n = grid[0].size();
        int count = 0;
        vector<vector<int>> dp(m,vector<int>(n,-1));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                count = (count+dfs(i,j,grid,dp))%mod;
        }
        return count;
    }
    int dfs(int i,int j,vector<vector<int>>& grid,vector<vector<int>>& dp){
        if(dp[i][j]!=-1)
            return dp[i][j];
        int res = 1;
        int dr[4] = {1,0,-1,0};
        int dc[4] = {0,1,0,-1};
        for(int k=0;k<4;k++){
            int nr = i+dr[k];
            int nc = j+dc[k];
            if(nr>=m||nc>=n||nr<0||nc<0)
                continue;
            if(grid[nr][nc]<grid[i][j])
                res = (res+dfs(nr,nc,grid,dp))%mod;
        }  
        return dp[i][j] = res;
    }
};