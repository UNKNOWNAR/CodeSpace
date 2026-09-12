class Solution {
public:
    const int dr[4] = {1,-1,0,0};
    const int dc[4] = {0,0,-1,1};
    int m,n;
    int dp[75][75][76][4]={-1};
    int minCost(vector<vector<int>>& grid, int k) {
        //down-0 up-1 left-2 right-3
        m = grid.size();
        n = grid[0].size();
        memset(dp, -1, sizeof(dp));
        int res = min(solve(0,0,k,0,grid),solve(0,0,k,3,grid));
        if(res==1e9)
            return -1;
        return res;
    }
    int solve(int row,int col,int k,int prev,vector<vector<int>>& grid){
        if(row==m-1&&col==n-1)
            return grid[row][col];
        if(dp[row][col][k][prev]!=-1)
            return dp[row][col][k][prev];
        int min_dist = 1e9;
        for(int i=0;i<4;i++){
            int nr = row+dr[i];
            int nc = col+dc[i];
            if(nr<0||nc<0||nr==m||nc==n)
                continue;
            if(i==prev)
                min_dist = min(min_dist,grid[row][col]+solve(nr,nc,k,i,grid));
            else if(k!=0)
                min_dist = min(min_dist,grid[row][col]+solve(nr,nc,k-1,i,grid));
        }
        return dp[row][col][k][prev] = min_dist;
    }
};