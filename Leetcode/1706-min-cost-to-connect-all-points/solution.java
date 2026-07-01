class Solution {
    //T:O(N^2.logN) and S:O(N) N-number of points
    //Minimum Spanning Tree (MST) Prim's Algorithm
    public int minCostConnectPoints(int[][] points) {
        int edgeCount = 0;
        Queue<int[]> q = new PriorityQueue<>((a,b)->a[0]-b[0]);
        int mstWeight = 0;
        int n = points.length;
        boolean[] visited = new boolean[n];
        q.offer(new int[]{0,0});
        while (edgeCount<n) {
            int[] cur = q.poll();
            int w = cur[0];
            int u = cur[1];
            if (visited[u]) continue;
            visited[u] = true;
            edgeCount++;
            mstWeight+=w;
            for (int v=0; v<n; v++) {
                if (!visited[v]) {
                    q.offer(new int[]{Math.abs(points[v][0]-points[u][0])+Math.abs(points[v][1]-points[u][1]), v});
                }
            }
        }
        return mstWeight;
    }
}


