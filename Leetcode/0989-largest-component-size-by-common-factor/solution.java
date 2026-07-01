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
    public int largestComponentSize(int[] nums) {
        int maxVal = 0;
        for(int num:nums)   maxVal = Math.max(num,maxVal);
        int[] spf = new int[maxVal + 1];
        for (int i = 2; i <= maxVal; i++) spf[i] = i;
        for(int i=2;i*i<=maxVal;i++){
            if(spf[i]==i){//i is prime
                for (int j = i * i; j <= maxVal; j += i) 
                    if (spf[j] == j) spf[j] = i; // Mark 'i' as the SPF for its multiples
            }
        }
        int n = nums.length;
        DSU dsu = new DSU(n);
        // Map: Prime Factor -> The first index in 'nums' that has this factor
        Map<Integer, Integer> factorToIndex = new HashMap<>();
        int ans = 1;

        for(int i=0;i<n;i++){
            int val = nums[i];
            while(val>1){
                int p = spf[val];
                if(!factorToIndex.containsKey(p))
                    factorToIndex.put(p,i);
                else{
                    dsu.union(i,factorToIndex.get(p));
                    ans = Math.max(ans,dsu.getSize(i));
                }
                while(val%p==0)
                    val/=p;
            }
        }
        return ans;
    }
}
