class Solution {
    public int snakesAndLadders(int[][] board) {
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> queue = new LinkedList<>();
        queue.add(1);
        int n = board.length;
        int moves=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int j=0;j<size;j++) {
                int curr = queue.poll();
                for (int i = 1; i <=6; i++) {    // fix dice loop
                    int next = curr + i;
                    if (next > n*n) continue;
                    int val = value(board, n, next);
                    int dest = (val==-1) ? next : val;
                    if (dest == n*n)
                        return moves+1;
                    if (!visited.contains(dest)){
                        visited.add(dest);
                        queue.add(dest);
                    }
                }
            }
            moves++;
        }
        return -1;
    }
    public int value(int[][] board,int n,int indx) {
        if((((indx-1)/n)+1)%2==0)
            return board[n-1-(indx-1)/n][n-1-(indx-1)%n];
        return board[n-1-(indx-1)/n][(indx-1)%n];
    }
}

