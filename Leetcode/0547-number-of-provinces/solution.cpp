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
    int findCircleNum(vector<vector<int>>& isConnected) {
        int n = isConnected.size();
        DSU dsu(n);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (isConnected[i][j] == 1) 
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
