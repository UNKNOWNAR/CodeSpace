class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        for(int row[]:mat){
            Arrays.sort(row);
        }
        int roWindx = 0;
        int maxmCount = 0;
        int maxmIndx = 0;
        for(int row[]:mat){
            int count = 0;
            for(int ele:row){
                if(ele==1)
                    count++;
            }
            if(count>maxmCount){
                maxmIndx = roWindx;
                maxmCount = count;
            }
            roWindx++;
        }
        return new int[]{maxmIndx,maxmCount};
    }
}
