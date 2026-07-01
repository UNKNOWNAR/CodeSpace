class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int dist[] = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;
        for(int i=0;i<k+1;i++){
            int[] temp = dist.clone();
            for(int flightPath[]:flights){
                int u = flightPath[0];
                int v = flightPath[1];
                int wt = flightPath[2];
                if(dist[u]!=Integer.MAX_VALUE&&temp[v]>wt+dist[u])
                    temp[v]=wt+dist[u];
            }
            dist = temp;
        }
        if(dist[dst]==Integer.MAX_VALUE)
            return -1;
        return dist[dst];
    }
}
