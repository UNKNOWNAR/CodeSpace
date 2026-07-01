class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long sum = 0;
        long rowSum = 0;
        if(sum%2!=0)
            return false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                sum += grid[i][j];
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                rowSum += grid[i][j];
            if(sum==2*rowSum)
                return true;
        }
        long colSum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                colSum += grid[j][i];
            if(sum==2*colSum)
                return true;
        }
        return false;
    }
}
