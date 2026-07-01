class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,((x,y)->x[1]-y[1]));
        int end=intervals[0][1];
        int n=intervals.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=end){
                count++;
                end=intervals[i][1];
            }
        }
        return n-count;
    }
}
