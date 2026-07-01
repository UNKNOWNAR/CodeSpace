class Solution {
    int r[][];
    int n;
    int range[][];
    Integer dp[][];
    public int maxWalls(int[] robots, int[] distance, int[] walls) {
        n = robots.length;
        //n+2 coz we want to have robots at 0 and Inf so that every wall will have one robot at left amd right of the wall
        r = new int[n][2];
        range = new int[n][2];
        dp = new Integer[n][2];
        for(int i=0;i<n;i++){
            r[i][0] = robots[i];
            r[i][1] = distance[i];
        }
        Arrays.sort(r,(a,b)->a[0]-b[0]);
        Arrays.sort(walls);
        for(int i=0;i<n;i++){
            int pos = r[i][0];
            int d = r[i][1];
            int leftLimit = (i==0)?1:r[i-1][0]+1;
            int rightLimit = (i==n-1)?(int)1e9:r[i+1][0]-1;
            range[i][0] = Math.max(pos-d,leftLimit);
            range[i][1] = Math.min(pos+d,rightLimit);
        }
        return solve(walls,0,0); 
    }
    //dir = 1 prev robot shoot towards right.=0 prev robot shoot towrds left
    private int solve(int walls[],int indx,int prevdir){
        if(indx==n)
            return 0;
        if(dp[indx][prevdir]!=null)
            return dp[indx][prevdir];
        int leftRange = range[indx][0];
        if(prevdir==1)
            leftRange = Math.max(leftRange,range[indx-1][1]+1);
        int takeLeft = countWalls(walls,leftRange,r[indx][0])+solve(walls,indx+1,0);
        int takeRight = countWalls(walls,r[indx][0],range[indx][1])+solve(walls,indx+1,1);
        return dp[indx][prevdir] = Math.max(takeLeft,takeRight);
    }
    private int countWalls(int walls[],int leftRange,int rightRange){
        return upperBound(walls,rightRange)-lowerBound(walls,leftRange);
    }
    private int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] > target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}
