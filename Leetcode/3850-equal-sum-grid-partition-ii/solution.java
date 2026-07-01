class Solution {
    long totalSum;
    public boolean check(int grid[][]){
        HashSet<Long> unique = new HashSet<>();
        long topSum = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                topSum += grid[i][j];
                unique.add((long)grid[i][j]);
            }
            long diff = 2*topSum-totalSum;
            if(diff==0)   return true;
            if(grid[0][0]==diff||grid[0][n-1]==diff)  return true;
            if(diff==grid[i][0])    return true;
            if(i>0&&n>1&&unique.contains(diff))
                return true;
        }
        return false;
    }
    private void reverse(int[][] grid) {
        int top = 0, bottom = grid.length - 1;
        while (top < bottom) {
            int[] temp = grid[top];
            grid[top] = grid[bottom];
            grid[bottom] = temp;
            top++;
            bottom--;
        }
    }
    public boolean canPartitionGrid(int[][] grid) {
        totalSum = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                totalSum += grid[i][j];
        }
        if(check(grid))
            return true;
        reverse(grid);
        if(check(grid))
            return true;
        int transpose[][] = new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                transpose[j][i] = grid[i][j];
        }
        if(check(transpose))
            return true;
        reverse(transpose);
        if(check(transpose))
            return true;
        return false;
    }
}
