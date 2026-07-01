class Solution {
    private List<List<String>> result = new ArrayList<>();
    private char[][] board;
     public List<List<String>> solveNQueens(int n) {
        board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        NQueens(0, n);
        return result;
    }
    public void NQueens(int row,int n){
        if (row == n) {
            List<String> config = new ArrayList<>();
            for (int i = 0; i < n; i++) 
                config.add(new String(board[i]));
            result.add(config);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, n)) {
                board[row][col] = 'Q';
                NQueens(row + 1, n);
                board[row][col] = '.';  
            }
        }
    }
    public boolean isSafe(int currRow,int currColumn,int n){
        for(int i=0;i<n;i++){
            if(currRow!=i&&board[i][currColumn]=='Q')
                return false;
        }
        for(int i=currRow-1,j=currColumn-1;i>-1&&j>-1;i--,j--){
            if(board[i][j]=='Q')
                return false;
        }
        for(int i=currRow-1,j=currColumn+1;i>-1&&j<n;i--,j++){
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }
}
