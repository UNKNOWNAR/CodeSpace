class Solution {
    private boolean visited[];
    private int tin[];
    private int low[];
    private List<List<Integer>> bridges;
    private int timer = 1;
    private void dfs(int node,int parent,List<List<Integer>> adj){
        visited[node] = true;
        tin[node] = low[node] = timer;
        timer++;
        for(Integer it: adj.get(node)){
            if(it==parent) continue;
            if(visited[it])
                low[node] = Math.min(low[node],low[it]);
            else{
                dfs(it,node,adj);
                low[node] = Math.min(low[node],low[it]);
                //bridge node----it
                if(low[it]>tin[node])
                    bridges.add(Arrays.asList(it,node));
            }     
        }
    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(List<Integer> itr: connections){
            int u = itr.get(0);
            int v = itr.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        visited = new boolean[n];
        tin = new int[n];
        low = new int[n];
        bridges = new ArrayList<>();
        dfs(0,-1,adj);
        return bridges;
    }
}
