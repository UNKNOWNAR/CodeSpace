class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        queue<pair<int,int>> q;
        bool allOk = true;
        int fresh = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)
                    q.push({i,j});
                if(grid[i][j]==1)
                    fresh++;
            }
        }
        if(fresh==0)
            return 0;
        int time = -1;
        int dr[] = {1,0,-1,0};
        int dc[] = {0,-1,0,1};
        while(!q.empty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int r = q.front().first;
                int c = q.front().second;
                q.pop();
                for(int j=0;j<4;j++){
                    int nr = r+dr[j];
                    int nc = c+dc[j];
                    if(nr>=m||nr<0||nc>=n||nc<0)
                        continue;
                    if(grid[nr][nc]==1){
                        q.push({nr,nc});
                        grid[nr][nc] = 2;
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh==0?time:-1;
    }
};