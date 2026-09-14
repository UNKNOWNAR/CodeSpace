class Solution {
public:
    int m,n;
    int INF = 1e9;
    int minPathSum(vector<vector<int>>& grid) {
        m = grid.size();
        n = grid[0].size();
        vector<vector<int>> dp(m,vector<int>(n,-1));
        return maxSum(0,0,grid,dp);
    }
    int maxSum(int r,int c,vector<vector<int>>& grid,vector<vector<int>>& dp){
        if(r==m-1&&c==n-1)
            return grid[r][c];
        if(r==m||c==n)
            return INF;
        if(dp[r][c]!=-1)
            return dp[r][c];
        //right
        int right = maxSum(r,c+1,grid,dp);
        //down
        int down = maxSum(r+1,c,grid,dp);
        return dp[r][c] = min(right,down) + grid[r][c];
    }
};