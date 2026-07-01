class Solution {
    private final int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    int rows,cols;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0)
            return res;

        rows = heights.length;
        cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];

         // Pacific ocean (top and left)
        for (int i = 0; i < rows; i++)
            dfs(heights, i, 0, pacific);
        for (int j = 0; j < cols; j++)
            dfs(heights, 0, j, pacific);

        // Atlantic ocean (bottom and right)
        for (int i = 0; i < rows; i++)
            dfs(heights, i, cols - 1, atlantic);
        for (int j = 0; j < cols; j++)
            dfs(heights, rows - 1, j, atlantic);

        // Cells reachable by both oceans
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (pacific[i][j] && atlantic[i][j])
                    res.add(Arrays.asList(i, j));

        return res;
    }
     private void dfs(int[][] heights, int row, int col, boolean[][] visited) {
        visited[row][col] = true;
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols)
                continue;

            if (!visited[newRow][newCol] && heights[newRow][newCol] >= heights[row][col])
                dfs(heights, newRow, newCol, visited);
        }
    }
}
