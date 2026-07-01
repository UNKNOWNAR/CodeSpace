class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int row[]:grid){
            for(int col:row){
                if(col<0)
                    count++;
            }
        }
        return count;
    }
}
