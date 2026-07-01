class Solution {
    public int maxAreaOfIsland(int[][] grid) {
     int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                int area=solve(grid,i,j);
                max=Math.max(max,area);  
            }
             }
        }
         return max;

}
public int solve(int [][]grid,int row,int col){
    if(col<0||row<0||row>=grid.length||col>=grid[0].length||grid[row][col]==0){
        return 0;
    }
    grid[row][col]=0;
    return 1+ solve(grid,row+1,col)+
    solve(grid,row-1,col)+
    solve(grid,row,col+1)+
    solve(grid,row,col-1);
        
    }
}
