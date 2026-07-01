class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<Integer>[] adj = new ArrayList[n + 1];
        for(int i=1;i<=n;i++)
            adj[i] = new ArrayList<>();

        for (int[] d : dislikes) {
            adj[d[0]].add(d[1]);
            adj[d[1]].add(d[0]);
        }
        int[] color = new int[n + 1];

        for(int i=1;i<=n;i++){
            if(color[i]==0){
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                color[i] = 1;
                while(!q.isEmpty()){
                    int lvlSize = q.size();
                    for(int j=0;j<lvlSize;j++){
                        int curr = q.poll();
                        List<Integer> neighbours = adj[curr];
                        for(int neighbour:neighbours){
                            if(color[neighbour]==color[curr])   return false;
                            if (color[neighbour] == 0) {
                                color[neighbour] = (color[curr] == 1) ? 2 : 1;
                                q.add(neighbour);
                            }
                        }
                    }
                    
                }
            }
        }
        return true;
    }
}
