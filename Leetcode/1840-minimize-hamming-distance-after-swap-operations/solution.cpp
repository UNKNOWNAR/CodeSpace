class Solution {
private: class DSU{
    vector<int> parent;
    vector<int> size;
public:
    DSU(int n){
        parent.resize(n);
        iota(parent.begin(),parent.end(),0);
        size.assign(n,1);
    }
    int find(int x){
        if(parent[x]==x)
            return x;
        return parent[x]=find(parent[x]);
    }
    void merge(int x,int y){
        int parentX = find(x);
        int parentY = find(y);
        if(parentX==parentY)
            return;
        if(size[parentX]>size[parentY]){
            parent[parentY] = parentX;
            size[parentX] += size[parentY];
        }
        else{
            parent[parentX] = parentY;
            size[parentY] += size[parentX];
        }
    }
};
public:
    int minimumHammingDistance(vector<int>& source, vector<int>& target, vector<vector<int>>& allowedSwaps) {
        int n = source.size();
        DSU dsu(n);
        for(auto &vec: allowedSwaps)
            dsu.merge(vec[0],vec[1]);
        unordered_map<int,unordered_map<int,int>> groupFreq;
        for(int i=0;i<n;i++){
            int curr = source[i];
            int parent = dsu.find(i);
            groupFreq[parent][curr]++;
        }
        int dist = 0;
        for(int i=0;i<n;i++){
            int parent = dsu.find(i);
            if(groupFreq[parent][target[i]]>0)
                groupFreq[parent][target[i]]--;
            else
                dist++;
        }
        return dist;
    }
};
