class Solution {
public:
    using ll = long long;
    int m,n,k;
    int dfs(int r,int c,vector<vector<int>>& grid,vector<vector<int>>& vis){
        if(r<0||c<0||r>=m||c>=n||vis[r][c]||grid[r][c]==0)
            return 0;
        ll sum = grid[r][c];
        vis[r][c] = true;
        int dr[4] = {1,0,-1,0};
        int dc[4] = {0,1,0,-1};
        for(int i=0;i<4;i++)
            sum = (sum+dfs(r+dr[i],c+dc[i],grid,vis))%k;
        return sum%k;
    }
    int countIslands(vector<vector<int>>& grid, int k) {
        m = grid.size(),n = grid[0].size(),this->k = k;
        int count = 0;   
        vector<vector<int>> vis(m,vector<int>(n));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0&&!vis[i][j]){
                    if(dfs(i,j,grid,vis)%k==0)
                        count++;
                }
            }
        }
        return count;
    }
};