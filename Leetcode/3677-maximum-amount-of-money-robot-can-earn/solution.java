class Solution {
    int m;
    int n;
    Integer dp[][][];
    public int maximumAmount(int[][] coins) {
        m = coins.length;
        n = coins[0].length;
        dp = new Integer[m][n][3];
        return  calcCoins(0,0,coins,2);
    }
    private int calcCoins(int row,int col,int[][] coins,int k){
        if(row==m||col==n)
            return (int)-1e9;
        if(row==m-1&&col==n-1){
            if(k>0&&coins[row][col]<0)    return 0;
            return coins[row][col];
        }
        if(dp[row][col][k]!=null)
            return dp[row][col][k];
        int take = coins[row][col] + Math.max(calcCoins(row+1,col,coins,k),calcCoins(row,col+1,coins,k));
        int dontTake = (int)-1e9;
        if(k>0&&coins[row][col]<0)
            dontTake = Math.max(calcCoins(row+1,col,coins,k-1),calcCoins(row,col+1,coins,k-1));
        return dp[row][col][k] = Math.max(take,dontTake);
    }
}
