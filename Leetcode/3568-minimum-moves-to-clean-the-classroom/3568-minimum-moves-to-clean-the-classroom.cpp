class Solution {
public:
    struct state{
        int r;
        int c;
        int energy;
        int mask;
    };
    int minMoves(vector<string>& classroom, int energy) {
        int sR = 0,sC = 0,m = classroom.size(),n = classroom[0].size(),bitPosn = 0;
        const int dr[4] = {1,0,-1,0};
        const int dc[4] = {0,-1,0,1};
        vector<vector<int>> litterBitPosn(m,vector<int>(n));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(classroom[i][j]=='S'){
                    sR = i;
                    sC = j;
                }
                else if(classroom[i][j]=='L'){
                    litterBitPosn[i][j] = bitPosn;
                    bitPosn++;
                }
            }
        } 
        int allcollected = (1<<bitPosn)-1;
        if(bitPosn==0)
            return 0;
        vector<vector<vector<vector<bool>>>> visited(m,vector<vector<vector<bool>>>(n,vector<vector<bool>>(energy+1,vector<bool>(allcollected+1))));
        queue<state> q;
        q.push({sR,sC,energy,0});
        visited[sR][sC][energy][0] = true;
        int moves = 0;
        while(!q.empty()){
            int siz = q.size();
            while(siz--){
                state curr = q.front();
                q.pop();
                if(curr.mask==allcollected)
                    return moves;
                if(curr.energy == 0)
                    continue;
                for(int i=0;i<4;i++){
                    int nr = curr.r+dr[i];
                    int nc = curr.c+dc[i];
                    if(nr<0||nc<0||nr>=m||nc>=n||classroom[nr][nc]=='X')    
                        continue;
                    int nextEnergy = curr.energy-1;
                    int nextMask = curr.mask;
                    if(classroom[nr][nc]=='R')
                        nextEnergy = energy;
                    else if(classroom[nr][nc]=='L')
                        nextMask |= 1<<litterBitPosn[nr][nc];
                    if(!visited[nr][nc][nextEnergy][nextMask]){
                        q.push({nr,nc,nextEnergy,nextMask});
                        visited[nr][nc][nextEnergy][nextMask] = true;
                    }
                }
            }
            moves++;
        }
        return -1;
    }
};