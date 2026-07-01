import java.util.*;

class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int rightDiagonal[][] = new int[m][n];
        int leftDiagonal[][] = new int[m][n];
        Set<Integer> unique = new HashSet<>();

        // Prefix sums for top-right to bottom-left ( / )
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                leftDiagonal[i][j] = grid[i][j];
                if (i > 0 && j < n - 1)
                    leftDiagonal[i][j] += leftDiagonal[i - 1][j + 1];
            }
        }

        // Prefix sums for top-left to bottom-right ( \ )
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rightDiagonal[i][j] = grid[i][j];
                if (i > 0 && j > 0)
                    rightDiagonal[i][j] += rightDiagonal[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                unique.add(grid[i][j]); // Add single cell
                int side = 1;
                while (i - side >= 0 && i + side < m && j - side >= 0 && j + side < n) {
                    int topR = i - side, topC = j;
                    int botR = i + side, botC = j;
                    int leftR = i, leftC = j - side;
                    int rightR = i, rightC = j + side;

                    int sum = 0;
                    // Segment 1: Top to Right ( \ )
                    sum += rightDiagonal[rightR][rightC] - (topR > 0 && topC > 0 ? rightDiagonal[topR - 1][topC - 1] : 0);
                    // Segment 2: Left to Bottom ( \ )
                    sum += rightDiagonal[botR][botC] - (leftR > 0 && leftC > 0 ? rightDiagonal[leftR - 1][leftC - 1] : 0);
                    // Segment 3: Top to Left ( / )
                    sum += leftDiagonal[leftR][leftC] - (topR > 0 && topC < n - 1 ? leftDiagonal[topR - 1][topC + 1] : 0);
                    // Segment 4: Right to Bottom ( / )
                    sum += leftDiagonal[botR][botC] - (rightR > 0 && rightC < n - 1 ? leftDiagonal[rightR - 1][rightC + 1] : 0);

                    // Subtract corners added twice
                    sum -= (grid[topR][topC] + grid[botR][botC] + grid[leftR][leftC] + grid[rightR][rightC]);
                    
                    unique.add(sum);
                    side++;
                }
            }
        }

        // Convert to array and sort descending
        int[] arr = unique.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        
        int count = Math.min(arr.length, 3);
        int[] res = new int[count];
        for (int k = 0; k < count; k++) {
            res[k] = arr[arr.length - 1 - k];
        }
        return res;
    }
}
