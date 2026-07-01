class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int prev[][] = new int[n][n];
        for(int j1=0;j1<n;j1++){
            for(int j2=0;j2<n;j2++){
                if(j1==j2){
                    prev[j1][j1] = grid[m-1][j1];
                    continue;
                }
                prev[j1][j2] = grid[m-1][j1]+grid[m-1][j2];
            }
        }
        for(int i=m-2;i>=0;i--){
            int curr[][] = new int[n][n];
            for(int j1=0;j1<n;j1++){
                for(int j2=0;j2<n;j2++){
                    int maxCherry = 0;
                    for(int a=-1;a<2;a++){
                        for(int b=-1;b<2;b++){
                            if(j1+a<0||j1+a==grid[0].length||j2+b<0||j2+b==grid[0].length)
                                continue;
                            maxCherry = Math.max(prev[j1+a][j2+b],maxCherry);
                        }
                    }
                    if(j1==j2)
                        maxCherry += grid[i][j1];
                    else
                        maxCherry += grid[i][j1]+grid[i][j2];     
                    curr[j1][j2] = maxCherry;
                }
            }
            prev = curr;
        }
        return prev[0][n-1];
    }
}
