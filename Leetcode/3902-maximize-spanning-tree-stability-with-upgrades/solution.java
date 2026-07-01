class DSU {

    private int[] parent;
    private int[] size;
    DSU(int n) {
        parent = new int[n];
        size = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x) {
        if (parent[x] == x) 
            return x;
        return parent[x] = find(parent[x]);
    }

    void join(int x, int y) {
        int px = find(x);
        int py = find(y);
        if(px!=py){
            if(size[px]>size[py]){
                parent[py] = px;
                size[px] += size[py];
            }
            else{
                parent[px] = py;
                size[py] += size[px];
            }
        }
    }

    int getSize(int x){
        return size[find(x)];
    }
}
class Solution {
    public int maxStability(int n, int[][] edges, int k) {
        DSU dsu = new DSU(n);
        int low = 1;
        int high = 0;
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            int s = edge[2];
            int m = edge[3];
            
            high = Math.max(high,s*2);
            if(m==1){
                if(dsu.find(u)==dsu.find(v))//cycle is formaing with the must include edges not property of Spanning Tree
                    return -1;
                dsu.join(u,v);
            }
        }
        while(low<=high){
            int mid = (low+high)>>1;
            if(check(edges,n,k,mid))
                low = mid+1;
            else
                high = mid-1;
        }
        return high==0?-1:high;
    }
    private boolean check(int edges[][],int n,int k,int mid){
        DSU dsu = new DSU(n);
        List<int[]> canUpgrade = new ArrayList<>();
        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            int s = edge[2];
            int m = edge[3];
            if(m==1){
                if(s<mid)
                    return false;
                dsu.join(u,v);
            }
            else{
                if(s>=mid){
                    //no need to upgrade
                    dsu.join(u,v);
                }
                else if(2*s>=mid){
                    canUpgrade.add(new int[]{u,v});
                }
            }
        }
        for(int edge[]:canUpgrade){
            int u = edge[0];
            int v = edge[1];
            if(dsu.find(u)!=dsu.find(v)){
                if(k<=0)
                    return false;
                k--;//upgrade
                dsu.join(u,v);
            }
        }
        return dsu.getSize(0)==n;
    }
}
