class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        long absSum = 0;
        int negCount = 0;
        int minAbs = Integer.MAX_VALUE;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                absSum += Math.abs(matrix[row][col]);
                if(matrix[row][col]<0)
                    negCount++;
                minAbs = Math.min(Math.abs(matrix[row][col]),minAbs);
            }
        }
        if((negCount&1)==0)
            return absSum;
        return absSum-2*minAbs;
    }
}
