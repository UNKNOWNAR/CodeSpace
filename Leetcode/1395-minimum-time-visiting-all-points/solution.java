class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x = points[0][0];
        int y = points[0][1];
        int time = 0;
        for(int i=1;i<points.length;i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            if(Math.abs(x-x1)>Math.abs(y-y1)){
                y=y1;
                time += Math.abs(y1-y);
            }
            else if(Math.abs(x-x1)<Math.abs(y-y1)){
                x = x1;
                
            }
            else
                time += Math.abs(x1-x);
            if(y1==y)
                time += Math.abs(x1-x);
            if(x1==x)
                time += Math.abs(y1-y);
            x = x1;
            y = y1;
        }
        return time;
    }
}
