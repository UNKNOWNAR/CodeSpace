class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int directions[][] = {{0,1},{1,0},{-1,0},{0,-1}};
        PriorityQueue<Trio> pq = new PriorityQueue<>((a,b)->a.weight-b.weight);
        boolean visited[][] = new boolean[n][n];

        visited[0][0] = true; 
        pq.add(new Trio(grid[0][0],0,0));

        while(!pq.isEmpty()){
            Trio temp = pq.poll();
            if(temp.x==n-1&&temp.y==n-1)
                return temp.weight;

            for(int direction[]:directions){
                int x = temp.x+direction[0];
                int y = temp.y+direction[1];
                if(x<0||x==n||y<0||y==n||visited[x][y])
                    continue;
                pq.offer(new Trio(Math.max(temp.weight,grid[x][y]),x,y));
                visited[x][y] = true;
            }
        }
        return -1;
    }
    private class Trio{
        int weight;
        int x;
        int y;
        Trio(int weight,int x,int y){
            this.weight = weight;
            this.x = x;
            this.y = y;
        }
    }
}
