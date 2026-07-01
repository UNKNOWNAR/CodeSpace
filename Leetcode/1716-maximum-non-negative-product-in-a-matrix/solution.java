class Solution {
    private class Pair{
        long max;
        long min;
        Pair(){}
        Pair(long max,long min){
            this.max=max;
            this.min=min;
        }
    }
    int mod = (int)1e9+7;
    int m;
    int n;
    Pair[][] dp;
    public int maxProductPath(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        dp  = new Pair[m][n];
        Pair temp = helper(grid,0,0);
        if(temp.max<0)
            return -1;
        return (int)(temp.max%mod);
    }
    public Pair helper(int[][] grid,int row,int col){
        if(dp[row][col]!=null)
            return dp[row][col];
        if(row==m-1&&col==n-1)
            return new Pair(grid[row][col],grid[row][col]);
        long maxVal = Long.MIN_VALUE;
        long minVal = Long.MAX_VALUE;
        if(row!=m-1){
            Pair down = helper(grid, row + 1, col);
            long v1 = (long) grid[row][col] * down.max;
            long v2 = (long) grid[row][col] * down.min;
            maxVal = Math.max(maxVal, Math.max(v1, v2));
            minVal = Math.min(minVal, Math.min(v1, v2));
        }
        if(col!=n-1){
            Pair right = helper(grid, row, col + 1);
            long v1 = (long) grid[row][col] * right.max;
            long v2 = (long) grid[row][col] * right.min;
            maxVal = Math.max(maxVal, Math.max(v1, v2));
            minVal = Math.min(minVal, Math.min(v1, v2));
        }
        return dp[row][col]=new Pair(maxVal,minVal);
    }
}
