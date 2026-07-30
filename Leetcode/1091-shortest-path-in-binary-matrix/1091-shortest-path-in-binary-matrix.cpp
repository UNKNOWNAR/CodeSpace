class Solution {
public:
    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {
        int n = grid.size();
        if(grid[0][0]==1)
            return -1;
        if(n==1)
            return 1;
        queue<pair<int,int>> q;
        vector<vector<bool>> vis(n,vector<bool>(n));
        q.push({0,0});
        vis[0][0] = true;
        int dr[8] = {-1,-1,-1,0,1,1,1,0};
        int dc[8] = {-1,0,1,1,1,0,-1,-1};
        int lvl = 1;
        while(!q.empty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                auto [r,c] = q.front();
                q.pop();
                for(int j=0;j<8;j++){
                    int nr = r+dr[j];
                    int nc = c+dc[j];
                    if(nr>=n||nc>=n||nr<0||nc<0||grid[nr][nc]==1||vis[nr][nc])
                        continue;
                    if(nr==n-1&&nc==n-1)
                        return lvl+1;
                    q.push({nr,nc});
                    vis[nr][nc] = true;
                }
            }
            lvl++;
        }
        return -1;
    }
};