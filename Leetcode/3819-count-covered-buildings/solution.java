class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int rmax[] = new int[n+1];
        int rmin[] = new int[n+1];
        Arrays.fill(rmin, n);

        int cmax[] = new int[n+1];
        int cmin[] = new int[n+1];
        Arrays.fill(cmin, n);

        for(int coords[]:buildings){
            int x = coords[0];
            int y = coords[1];
            rmax[y] = Math.max(rmax[y],x);
            rmin[y] = Math.min(rmin[y],x);
            cmax[x] = Math.max(cmax[x],y);
            cmin[x] = Math.min(cmin[x],y);
        }
        int ans = 0;
        for(int coords[]:buildings){
            int x = coords[0];
            int y = coords[1];
            if(rmax[y]>x&&rmin[y]<x&&cmax[x]>y&&cmin[x]<y)
                ans++;
        }
        return ans;
    }
}
