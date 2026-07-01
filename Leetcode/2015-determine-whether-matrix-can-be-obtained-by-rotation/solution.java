class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int counter = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(target[i][j]==mat[i][j])
                    counter++;
            }
        }
        if(counter==n*n)
            return true;
        counter = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(target[i][j]==mat[n-j-1][i])
                    counter++;
            }
        }
        if(counter==n*n)
            return true;
        counter = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(target[i][j]==mat[j][n-i-1])
                    counter++;
            }
        }
        if(counter==n*n)
            return true;
        counter = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(target[i][j]==mat[n-i-1][n-j-1])
                    counter++;
            }
        }
        if(counter==n*n)
            return true;
        return false;
    }
}
