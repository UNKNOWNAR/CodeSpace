class Solution {
    int n;
    boolean adjMatrix[][];
    private class DSU{
        int[] parent, size;
        DSU(int n){
            parent = new int[n];
            size = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = i;
                size[i] = 1;
            }
        }
        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]); // Path Compression
            return parent[x];
        }
        void unionBySize(int a, int b) {
        int pa = find(a), pb = find(b);
        if (pa == pb) return;
        if (size[pa] < size[pb]) {
            parent[pa] = pb;
            size[pb] += size[pa];
        } else {
            parent[pb] = pa;
            size[pa] += size[pb];
        }
    }
    }
    public int evenSumSubgraphs(int[] nums, int[][] edges) {
        n = nums.length;
        adjMatrix = new boolean[n][n];
        for(int edge[]: edges){
            int u = edge[0];
            int v = edge[1];
            adjMatrix[u][v] = true;
        }
        return helper(0,nums,new ArrayList(),0);
    }
    private int helper(int indx,int[] nums,List<Integer> nodes,int sum){
        int count = 0;
        int size = nodes.size();
        if(sum%2==0&&size>0){
            DSU dsu = new DSU(n);
            int temp  = 0;
            for(int i=0;i<size;i++){
                for(int j=i+1;j<size;j++){
                    if(adjMatrix[nodes.get(i)][nodes.get(j)])
                        dsu.unionBySize(nodes.get(i),nodes.get(j));
                }
            }
            count = 1;
            int parent = dsu.find(nodes.get(0));
            for(int node:nodes){
                if(dsu.find(node)!=parent)
                    count = 0;
            }
        }
        for(int i=indx;i<n;i++){
            nodes.add(i);
            count += helper(i+1,nums,nodes,sum+nums[i]);
            nodes.remove(nodes.size()-1);
        }
        return count;
    }
}
