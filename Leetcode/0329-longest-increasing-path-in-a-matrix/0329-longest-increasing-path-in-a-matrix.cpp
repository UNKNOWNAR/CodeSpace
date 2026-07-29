class Solution {
public:
    int m,n;
    int longestIncreasingPath(vector<vector<int>>& matrix) {
        m = matrix.size();
        n = matrix[0].size();
        int count = 0;
        vector<vector<int>> dp(m,vector<int>(n,-1));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                count = max(count,dfs(i,j,matrix,dp));
        }
        return count;
    }
    int dfs(int i,int j,vector<vector<int>>& grid,vector<vector<int>>& dp){
        if(dp[i][j]!=-1)
            return dp[i][j];
        int siz = 1;
        int dr[4] = {1,0,-1,0};
        int dc[4] = {0,1,0,-1};
        for(int k=0;k<4;k++){
            int nr = i+dr[k];
            int nc = j+dc[k];
            if(nr>=m||nc>=n||nr<0||nc<0)
                continue;
            if(grid[nr][nc]<grid[i][j])
                siz = max(siz,1+dfs(nr,nc,grid,dp));
        }  
        return dp[i][j] = siz;
    }
};