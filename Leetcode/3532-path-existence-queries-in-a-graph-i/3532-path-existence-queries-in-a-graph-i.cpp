class Solution {
    struct DSU{
        vector<int> parent;
        vector<int> size;
        DSU(int n){
            parent.resize(n);
            size.assign(n, 1);
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
            int pa = find(a);
            int pb = find(b);
            if (pa == pb) return;
            if(size[pa]<size[pb]){
                parent[pa] = pb;
                size[pb] += size[pa];
            }
            else{
                parent[pb] = pa;
                size[pa] += size[pb];
            }
            return;
        }
    };
public:
    vector<bool> pathExistenceQueries(int n, vector<int>& nums, int maxDiff, vector<vector<int>>& queries) {
        DSU dsu(n);
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]<=maxDiff)
                dsu.merge(i,i-1);
        }
        vector<bool> qans;
        for(auto &q:queries){
            int u = q[0];
            int v = q[1];
            qans.push_back(dsu.find(u)==dsu.find(v));
        }
        return qans;
    }
};