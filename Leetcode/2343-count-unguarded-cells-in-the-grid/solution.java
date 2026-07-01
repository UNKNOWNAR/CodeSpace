class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int grid[][] = new int[m][n];
        for(int guard[]:guards)
            grid[guard[0]][guard[1]] = 1;
        for(int wall[]:walls)
            grid[wall[0]][wall[1]] = 1;
        int occupied = guards.length+walls.length;
        for(int guard[]:guards){
            int row = guard[0]-1;
            int col = guard[1];
            while(row>=0&&grid[row][col]!=1){
                if(grid[row][col]==0){
                    occupied++;
                    grid[row][col]=2;
                }
                row--;
            }
            row = guard[0]+1;
            while(row<m&&grid[row][col]!=1){
                if(grid[row][col]==0){
                    occupied++;
                    grid[row][col]=2;
                }
                row++;
            }
            row = guard[0];
            col = guard[1]-1;
            while(col>=0&&grid[row][col]!=1){
                if(grid[row][col]==0){
                    occupied++;
                    grid[row][col]=2;
                }
                col--;
            }
            col = guard[1]+1;
            while(col<n&&grid[row][col]!=1){
                if(grid[row][col]==0){
                    occupied++;
                    grid[row][col]=2;
                }
                col++;
            }
        }
        return m*n-occupied;
    }
}
