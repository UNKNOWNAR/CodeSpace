class Solution {
public:
    int minimumEffortPath(vector<vector<int>>& heights) {
        struct Trio{
            int diff;
            int r;
            int c;
            bool operator>(const Trio& other) const{  
                return diff > other.diff; 
            }
        };
        priority_queue<Trio,vector<Trio>,greater<Trio>> pq;//minHEap
        int n = heights.size();
        int m = heights[0].size();
        vector<vector<int>> dist(n,vector<int>(m,1e9));
        dist[0][0] = 0;
        pq.push({0,0,0});
        int dr[4] = {1,0,-1,0};
        int dc[4] = {0,1,0,-1};
        while(!pq.empty()){
            auto [diff,r,c] = pq.top();
            pq.pop();
            if (diff > dist[r][c])
                continue;
            if(r==n-1&&c==m-1)
                return diff;
            for(int i=0;i<4;i++){
                int nr = r+dr[i];
                int nc = c+dc[i];
                if(nr>=n||nc>=m||nc<0||nr<0)
                    continue;
                int newDiff = max(abs(heights[r][c]-heights[nr][nc]),diff);
                if(newDiff<dist[nr][nc]){
                    dist[nr][nc] = newDiff;
                    pq.push({newDiff,nr,nc});
                }
            }
        }
        return 0;
    }
};