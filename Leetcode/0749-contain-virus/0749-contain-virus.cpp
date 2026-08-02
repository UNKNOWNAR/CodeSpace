class Solution {
public:
    int m,n;
void dfs(int r,int c,int id,vector<int>& compId,vector<vector<int>>& grid,map<int,vector<pair<int,int>>>& components){
    components[id].push_back({r,c});
    compId[r*n+c] = id;
    int dr[4]={1,0,-1,0};
    int dc[4]={0,1,0,-1};
    for(int k=0;k<4;k++){
        int nr=r+dr[k];
        int nc=c+dc[k];
        if(nr<0||nc<0||nr>=m||nc>=n||grid[nr][nc] != 1||compId[nr*n+nc]!=-1)
            continue;
        dfs(nr,nc,id,compId,grid,components);
    }
}
int containVirus(vector<vector<int>>& isInfected) {
    m = isInfected.size();
    n = isInfected[0].size();
    int walls = 0;
    while(true){
        int infected = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isInfected[i][j]==1)
                    infected++;
            }
        }
        if(infected==0)
            return walls;
        vector<int> compId(m*n,-1);
        map<int,vector<pair<int,int>>> components;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(compId[i*n+j]==-1&&isInfected[i][j]==1)
                    dfs(i,j,i*n+j,compId,isInfected,components);
            }
        }
        int space = 0;
        int QuarentineId = -1;
        for(auto &[id,cells] : components){
            set<pair<int,int>> frontier;
            for(auto [r,c]:cells){
                int dr[4] = {1,0,-1,0};
                int dc[4] = {0,1,0,-1};
                for(int i=0;i<4;i++){
                    int nr = r+dr[i];
                    int nc = c+dc[i];
                    if(nr<0||nc<0||nr>=m||nc>=n||isInfected[nr][nc]!=0)
                        continue;
                    frontier.insert({nr,nc});
                }
            }
            if(space<frontier.size()){
                space = frontier.size();
                QuarentineId = id;
            }
        }
        if (space == 0)
            return walls;
        set<pair<int,int>> frontier;
        int wallCount = 0;
        for (auto [r, c] : components[QuarentineId]) {
            int dr[4] = {1, 0, -1, 0};
            int dc[4] = {0, 1, 0, -1};
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr < 0 || nc < 0 || nr >= m || nc >= n)
                    continue;
                if (isInfected[nr][nc] != 0)
                    continue;
                frontier.insert({nr, nc});
                wallCount++;               
            }
        }
        for (auto [r, c] : components[QuarentineId]) 
            isInfected[r][c] = -1;
        walls += wallCount;
        set<pair<int,int>> toSpread;
        for (auto &[id, cells] : components) {
            if (id == QuarentineId)
                continue;
            for (auto [r, c] : cells) {
                int dr[4] = {1, 0, -1, 0};
                int dc[4] = {0, 1, 0, -1};
                for (int i = 0; i < 4; i++) {
                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    if (nr < 0 || nc < 0 || nr >= m || nc >= n || isInfected[nr][nc] != 0)
                        continue;
                    toSpread.insert({nr, nc});
                }
            }
            for (auto [r, c] : toSpread)
                isInfected[r][c] = 1;
        }
    }
}
};