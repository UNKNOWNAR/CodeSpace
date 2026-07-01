class Solution {
public:
    int m,n;
    int maxPathScore(vector<vector<int>>& grid, int k) {
        m = grid.size();
        n = grid[0].size();
        vector<vector<vector<int>>> dp(m, vector<vector<int>>(n, vector<int>(k + 1, -1)));
        int result = traverse(grid,k,0,0,dp);
        return result==-1e9?-1:result;
    }
    int traverse(vector<vector<int>>& grid,int k,int row,int col,vector<vector<vector<int>>>& dp){
        if(row==m||col==n)
            return -1e9;
        if(row==m-1&&col==n-1){
            if(grid[row][col]==0)
                return dp[row][col][k] = 0;
            else if(grid[row][col]>=1){
                if(k>0)
                    return dp[row][col][k] = grid[row][col];
                else
                    return dp[row][col][k] = -1e9;
            }
        }
        
        if(dp[row][col][k]!=-1)
            return dp[row][col][k];

        //go down
        int down = -1e9;
        if(grid[row][col]==0)
            down = traverse(grid,k,row+1,col,dp);
        else if(k>0)
            down = traverse(grid,k-1,row+1,col,dp);

        //go right
        int right = -1e9;
        if(grid[row][col]==0)
            right = traverse(grid,k,row,col+1,dp);
        else if(k>0)
            right = traverse(grid,k-1,row,col+1,dp);
            
        if(down==-1e9&&right==-1e9)
            return dp[row][col][k] = -1e9;
        return dp[row][col][k] = grid[row][col]+max(right,down);
    }
};
