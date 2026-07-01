class Solution {
    public int findTheCity(int n, int[][] edges, int max) {
        int[][] dist = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                dist[i][j] = 1000000;
            }
        }

        for(int[] edge : edges) {
            dist[edge[0]][edge[1]] = edge[2];
            dist[edge[1]][edge[0]] = edge[2];
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    int d = dist[j][i] + dist[i][k];
                    if(dist[j][k] > d)
                    dist[j][k] = dist[k][j] = d;
                }
            }
        }
        int min = n, ans = 0;
        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(dist[i][j] <= max) count++;
            }
            if(count <= min) {
                min = count;
                ans = i;
            }
        }
        return ans;
    }
}
