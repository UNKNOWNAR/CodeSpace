class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        int prevRow[] = new int[n];
        Arrays.fill(prevRow,0);
        dp = new int[m][n];
        dp[0][0] = 1;
        for(int i=0;i<m;i++){
            int currRow[] = new int[n];
            for(int j=0;j<n;j++){
                if(i==0&&j==0)
                    currRow[0] = 1;
                else if(j==0)
                    currRow[j] = prevRow[j];
                else
                    currRow[j] = prevRow[j]+currRow[j-1];
            }
            prevRow = currRow;
        }
        return prevRow[n-1];
    }
}
