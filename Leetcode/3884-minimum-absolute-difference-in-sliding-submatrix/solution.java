class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans[][] = new int[m-k+1][n-k+1];
        for(int i=0;i<m-k+1;i++){
            for(int j=0;j<n-k+1;j++){
                ans[i][j] = Integer.MAX_VALUE; 
                for(int l=i;l<i+k;l++){
                    for(int o=j;o<j+k;o++){
                        for(int x=i;x<i+k;x++){
                            for(int y=j;y<j+k;y++){
                                if(grid[l][o] == grid[x][y])
                                    continue;
                                ans[i][j] = Math.min(ans[i][j],Math.abs(grid[l][o]-grid[x][y]));
                            }
                        }
                    }
                }
                if(ans[i][j] == Integer.MAX_VALUE)
                    ans[i][j] = 0;
            }   
        }
        return ans;
    }
}
