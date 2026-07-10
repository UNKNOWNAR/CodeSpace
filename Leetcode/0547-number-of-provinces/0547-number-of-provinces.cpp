class Solution {
    public:
    class DSU{
        public:
        vector<int> parent,size;
        DSU(int n){
            parent.resize(n);
            size.resize(n);
            for(int i=0;i<n;i++){
                parent[i] = i;
                size[i] = 1;
            }
        }
        int find(int x){
            if(parent[x]!=x)
                parent[x] = find(parent[x]);
            return parent[x];
        }
        void merge(int a,int b){
            int pa = find(a),pb = find(b);
            if(pa==pb)  return;
            if(size[pa]>size[pb]){
                parent[pb] = pa;
                size[pa] += size[pb];
            }
            else{
                parent[pa] = pb;
                size[pb] += size[pa];
            }
        }
    };
    int findCircleNum(vector<vector<int>>& isConnected) {
        int n = isConnected.size();
        DSU dsu(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1)
                    dsu.merge(i,j);
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(i==dsu.find(i))
                count++;
        }
        return count;
    }
};