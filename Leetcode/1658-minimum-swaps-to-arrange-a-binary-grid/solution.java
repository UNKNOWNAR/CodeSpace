class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        boolean valid=true;
        int maxRight[] = new int[n];
        int swaps = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    maxRight[i] = Math.max(maxRight[i],j);
                if(maxRight[i]>i&&valid)
                    valid = false;
            }
        }
        if(valid)
            return swaps;
        for(int i=0;i<n;i++){
            int k = i;
            while(k<n&&maxRight[k]>i){
                if(maxRight[k]<=i)
                    break;
                k++;
            }
            if(k==n)    return -1;

            swaps += k-i;
            int val = maxRight[k];
            while(k>i){
                maxRight[k] = maxRight[k-1];
                k--;
            }
            maxRight[i] = val;
        }
        return swaps;
    }
}
