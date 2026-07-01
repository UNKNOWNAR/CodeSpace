class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        // 101x101 covers all possible constraints (up to 100 rows)
        double[][] tower = new double[101][101];
        tower[0][0] = (double) poured;

        for (int r = 0; r <= query_row; r++) {
            for (int c = 0; c <= r; c++) {
                // Calculate overflow from current glass
                double overflow = (tower[r][c] - 1.0) / 2.0;
                
                if (overflow > 0) {
                    // Send half to left-down and half to right-down
                    tower[r + 1][c] += overflow;
                    tower[r + 1][c + 1] += overflow;
                }
            }
        }

        // Return the amount in the target glass, capped at 1.0
        return Math.min(1.0, tower[query_row][query_glass]);
    }
}
