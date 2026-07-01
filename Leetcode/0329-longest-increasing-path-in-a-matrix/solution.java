class Solution {
    Integer dp[][];
    int m;
    int n;
    public int longestIncreasingPath(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        dp = new Integer[m][n];
        int maxLength = 0;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++)
                maxLength = Math.max(maxLength,calcPath(row,col,matrix));
        }
        return maxLength;
    }
    public int calcPath(int row,int col,int[][] matrix){
        if(dp[row][col]!=null)
            return dp[row][col];
        int maxLength=0;
        if(row!=0&&matrix[row][col]<matrix[row-1][col]){
            maxLength = Math.max(maxLength,calcPath(row-1,col,matrix));
        }
        if(row!=m-1&&matrix[row][col]<matrix[row+1][col]){
            maxLength = Math.max(maxLength,calcPath(row+1,col,matrix));
        }
        if(col!=0&&matrix[row][col]<matrix[row][col-1]){
            maxLength = Math.max(maxLength,calcPath(row,col-1,matrix));
        }
        if(col!=n-1&&matrix[row][col]<matrix[row][col+1]){
            maxLength = Math.max(maxLength,calcPath(row,col+1,matrix));
        }
        return dp[row][col]=maxLength+1;
    }
}
