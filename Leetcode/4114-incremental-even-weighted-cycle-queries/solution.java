class Solution {
    private class DSU{
        int parent[];
        int dist[];
        DSU(int n){
            parent = new int[n];
            dist = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = i;
                dist[i] = 0;
            }
        }
        int find(int x){
            if(x==parent[x])
                return x;
            int pX = find(parent[x]);
            dist[x] = (dist[x]+dist[parent[x]])%2;
            return parent[x] = pX;
        }
        boolean union(int u,int v,int w){
            int pU = find(u);
            int pV = find(v);
            if(pU==pV)
                return (dist[u]+dist[v])%2==w%2;//if both odd then even and both even then also good
            else{
                 parent[pU] = pV;
                 dist[pU] = (dist[u]+dist[pV]+dist[v]+w)%2;
                 return true;
            }   
        }
    }
    public int numberOfEdgesAdded(int n, int[][] edges) {
        DSU dsu = new DSU(n);
        int success = 0;
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if(dsu.union(u,v,w))
                success++;
        }
        return success;
    }
}
