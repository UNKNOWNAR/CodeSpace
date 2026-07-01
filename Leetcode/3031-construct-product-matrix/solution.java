import java.math.BigInteger;
class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int p[][] = new int[m][n];
        long totalProduct = 1;
        int mod = 12345;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                p[i][j] = (int)totalProduct;
                totalProduct = (totalProduct*grid[i][j])%mod;
            }
        }
        totalProduct = 1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                p[i][j] = (int)(totalProduct*p[i][j])%mod;
                totalProduct = (totalProduct*grid[i][j])%mod;
            }
        }
        return p;
    }
}
