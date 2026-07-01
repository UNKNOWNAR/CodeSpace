class Solution {
    public int[] findPeakGrid(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)>>1;
            int maxIndx = 0;
            for(int i=1;i<m;i++){
                if(matrix[i][mid]>matrix[maxIndx][mid])
                    maxIndx = i;
            }
            if(mid!=n-1&&matrix[maxIndx][mid]<matrix[maxIndx][mid+1])
                low = mid+1;
            else if(mid!=0&&matrix[maxIndx][mid-1]>matrix[maxIndx][mid])
                high = mid-1;
            else 
                return new int[]{maxIndx,mid};
        }
        return new int[]{-1,-1};
    }
}
