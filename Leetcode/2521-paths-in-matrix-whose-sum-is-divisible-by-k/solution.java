class Solution {
    int dp[][][];
    int mod = (int)1e9 + 7;
    public int numberOfPaths(int[][] grid, int k) {
        dp = new int[grid.length][grid[0].length][k];
        for(int arr[][]:dp){
            for(int arr1[]:arr){
                Arrays.fill(arr1,-1);
            }
        }
        return counterOfPaths(grid,grid.length-1,grid[0].length-1,0,k);
    }
    public int counterOfPaths(int[][] grid, int row,int col,int val, int k){
        if(row==-1||col==-1)
            return 0;
        val = (val+grid[row][col])%k;
        if(row==0 && col==0){
            if(val==0)
                return 1;
            else
                return 0;
        }
        if(dp[row][col][val]!=-1)
            return dp[row][col][val];
        int up = counterOfPaths(grid,row-1,col,val,k);
        int left = counterOfPaths(grid,row,col-1,val,k);
        return dp[row][col][val] = (left+up)%mod;
    }
}
