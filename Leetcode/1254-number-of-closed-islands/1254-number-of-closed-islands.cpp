class Solution {
public:
    int m,n;
    bool dfs(int r,int c,vector<vector<int>>& grid,vector<vector<bool>>& vis){
        if(r<0||c<0||r>=m||c>=n)
            return false;
        if(grid[r][c]||vis[r][c])
            return true;
        bool ans = true;
        vis[r][c] = true;
        int dr[4] = {1,0,-1,0};
        int dc[4] = {0,1,0,-1};
        for(int i=0;i<4;i++)
            ans &= dfs(r+dr[i],c+dc[i],grid,vis);
        return ans;
    }
    int closedIsland(vector<vector<int>>& grid) {
        m = grid.size(),n = grid[0].size();
        int cnt = 0;
        vector<vector<bool>> vis(m,vector<bool>(n));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!grid[i][j]&&!vis[i][j]&&dfs(i,j,grid,vis))
                    cnt++;
            }
        }
        return cnt;
    }
};