class Solution {
public:
    bool canReach(vector<int>& start, vector<int>& target) {
        if(start == target) return true;
        queue<pair<int,int>> q;
        vector<vector<bool>> vis(8,vector<bool>(8));
        q.push({start[0],start[1]});
        int moves = 0;
        int dr[8] = {-1,1,2,2,1,-1,-2,-2};
        int dc[8] = {2,2,1,-1,-2,-2,-1,1};
        vis[start[0]][start[1]] = true;
        while(!q.empty()){
            int siz = q.size();
            while(siz--){
                auto [r,c] = q.front();
                q.pop();
                for(int i=0;i<8;i++){
                    int nr = r+dr[i];
                    int nc = c+dc[i];
                    if(nr==target[0]&&nc==target[1])
                        return ((moves + 1) % 2 == 0);                        
                    if(nr>=8||nc>=8||nr<0||nc<0||vis[nr][nc])
                        continue;
                    vis[nr][nc] = true;
                    q.push({nr,nc});
                }
            }
            moves++;
        }
        return false;
    }
};