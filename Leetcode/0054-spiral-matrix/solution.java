class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0) return ans;

        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];

        // Direction arrays: Right, Down, Left, Up
        // dr = change in row, dc = change in col
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = 0, c = 0;
        int di = 0; // Direction index (0=Right, 1=Down, 2=Left, 3=Up)

        for (int i = 0; i < m * n; i++) {
            ans.add(matrix[r][c]);
            visited[r][c] = true;

            // Calculate candidate next step
            int nextR = r + dr[di];
            int nextC = c + dc[di];

            // Check if next step is valid (in bounds and not visited)
            if (nextR >= 0 && nextR < m && 
                nextC >= 0 && nextC < n && 
                !visited[nextR][nextC]) {
                
                // Move forward
                r = nextR;
                c = nextC;
            } else {
                // Turn Right
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
    }
}
