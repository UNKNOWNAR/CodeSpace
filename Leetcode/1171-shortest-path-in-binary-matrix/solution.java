
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] != 0 || grid[n-1][n-1] != 0) return -1;

        int[][] dir = {{-1,-1}, {-1,0}, {-1,1}, {0,-1}, {0,1}, {1,-1}, {1,0}, {1,1}};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        grid[0][0] = 1;  // reuse grid to store path length

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int r = cell[0], c = cell[1], d = grid[r][c];

            if (r == n-1 && c == n-1) return d;

            for (int[] dirn : dir) {
                int nr = r + dirn[0], nc = c + dirn[1];
                if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0) {
                    q.offer(new int[]{nr, nc});
                    grid[nr][nc] = d + 1;
                }
            }
        }

        return -1;
    }
}
