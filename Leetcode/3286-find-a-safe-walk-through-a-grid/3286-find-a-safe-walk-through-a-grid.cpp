class Solution {
    int m,n;
public:
    bool findSafeWalk(vector<vector<int>>& grid, int health) {
        m = grid.size();
        n = grid[0].size();
        vector<vector<vector<int>>> memo(m, vector<vector<int>>(n, vector<int>(m+n+1, -1)));
        return walk(0,0,grid,health,memo);
    }
    bool walk(int r,int c,vector<vector<int>>& grid, int health,vector<vector<vector<int>>>& memo){
        if(r==m||c==n||r<0||c<0)
            return false;
        if(grid[r][c]==1)
            health--;
        if(health==0)
            return false;
        if(r==m-1&&c==n-1&&health>0)
            return true;
        if(memo[r][c][health]!=-1)
            return memo[r][c][health];
        memo[r][c][health] = false;
        return memo[r][c][health] = walk(r+1,c,grid,health,memo) | walk(r-1,c,grid,health,memo) | walk(r,c+1,grid,health,memo) | walk(r,c-1,grid,health,memo);
    }
};