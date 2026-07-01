class Solution {
    private class DSU{
        int parent[];
        int size[];
        DSU(int n){
            parent = new int[n];
            size = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = i;
                size[i] = 1;
            }
        }
        int find(int x){
            if(parent[x]==x)
                return x;
            return parent[x] = find(parent[x]);
        }
        void union(int x,int y){
            int px = find(x);
            int py = find(y);
            int largerSize = 0;
            if(px!=py){
                if(size[px]>size[py]){
                    parent[py] = px;
                    size[px] += size[py];
                    largerSize = size[px];
                }
                else{
                    parent[px] = py;
                    size[py] += size[px];
                    largerSize = size[py];
                }
            }
        }
        int getSize(int x){
            return size[find(x)];
        }
    }
    public int maxActivated(int[][] points) {
        int n = points.length;
        if(n==1) return 2;

        DSU dsu = new DSU(n);
        Map<Integer, Integer> mapX = new HashMap<>();
        Map<Integer, Integer> mapY = new HashMap<>();       
        for(int i=0;i<n;i++){
            int x = points[i][0];
            int y = points[i][1];
            if(mapX.containsKey(x))
                dsu.union(i,mapX.get(x));
            else
                mapX.put(x,i);
            if(mapY.containsKey(y))
                dsu.union(i,mapY.get(y));
            else
                mapY.put(y,i);
        }
        List<Integer> componentSizes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (dsu.find(i) == i) 
                componentSizes.add(dsu.getSize(i));
        }

        Collections.sort(componentSizes, Collections.reverseOrder());
        int result = componentSizes.get(0) + 1;
        if (componentSizes.size() > 1) 
            result += componentSizes.get(1);
        return result;
    }
}
