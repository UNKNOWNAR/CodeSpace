class Solution {
public:
    int m,n;
    int numEnclaves(vector<vector<int>>& grid) {
        m = grid.size();
        n = grid[0].size();
        vector<vector<bool>> vis(m,vector<bool>(n));
        for(int i=0;i<m;i++)
            dfs(i,0,vis,grid);
        for(int i=1;i<n;i++)
            dfs(m-1,i,vis,grid);
        for(int i=m-2;i>=0;i--)
            dfs(i,n-1,vis,grid);
        for(int i=n-2;i>=1;i--)
            dfs(0,i,vis,grid);
        int count = 0;
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(!vis[i][j]&&grid[i][j]==1)
                    count++;
            }
        }
        return count;
    }
    void dfs(int r,int c,vector<vector<bool>>& vis,vector<vector<int>>& grid){
        if(r==m||r<0||c==n||c<0||grid[r][c]==0||vis[r][c])
            return;
        vis[r][c] = true;
        int dr[4] = {1,0,-1,0};
        int dc[4] = {0,1,0,-1};
        for(int i=0;i<4;i++)
            dfs(r+dr[i],c+dc[i],vis,grid);
    }
};