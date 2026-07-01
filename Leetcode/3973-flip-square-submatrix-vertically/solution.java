class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int startRow = x,startColumn = y;
        int endRow = x+k-1,endColumn = y+k-1;
        for(int i=startRow;i<=endRow;i++){
            if(i==endRow)
                continue;
            for(int j=startColumn;j<=endColumn;j++){
                grid[endRow][j] += grid[i][j];
                grid[i][j] = grid[endRow][j]-grid[i][j];
                grid[endRow][j] = grid[endRow][j]-grid[i][j];
            }
            endRow--;
        }
        return grid;
    }
}
