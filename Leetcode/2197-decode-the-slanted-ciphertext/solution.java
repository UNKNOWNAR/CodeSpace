class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) return encodedText;
        int cols = encodedText.length()/rows;
        char matrix[] = encodedText.toCharArray();
        int indx = 0;
        int len = 0;
        StringBuilder ans = new StringBuilder();
        indx = 0;
        int col = 0;
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                int colIndex = c + r; // Diagonal shift
                if (colIndex >= cols) break;
                ans.append(matrix[r * cols + colIndex]);
            }
        }
        return ans.toString().stripTrailing();
    }
}
