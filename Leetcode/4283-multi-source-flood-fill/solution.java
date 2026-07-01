class Solution {
    public int[][] colorGrid(int n, int m, int[][] sources) {
        int[][] matrix = new int[n][m];
        Queue<int[]> pq = new ArrayDeque<>();
        int[][] timeReached = new int[n][m];
        for (int[] row : timeReached) Arrays.fill(row, Integer.MAX_VALUE);
        for(int source[]:sources){
            if (source[2] > matrix[source[0]][source[1]]) {
                matrix[source[0]][source[1]] = source[2];
                timeReached[source[0]][source[1]] = -1;
                pq.add(new int[]{source[0],source[1],source[2]});
            }
        }
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int time = 0;
        while(!pq.isEmpty()){
            int size = pq.size();
            for(int i=0;i<size;i++){
                int temp[] = pq.poll();
                int r = temp[0];
                int c = temp[1];
                int color = temp[2];
                for(int dir[]:dirs){
                    int nr = r+dir[0];
                    int nc = c+dir[1];
                    if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                        if(matrix[nr][nc]<color&&timeReached[nr][nc]>=time){
                            matrix[nr][nc] = color;
                            pq.add(new int[]{nr,nc,color});
                            timeReached[nr][nc] = time;
                        }
                    }
                }
            }
            time++;
        }
        return matrix;
    }
}
