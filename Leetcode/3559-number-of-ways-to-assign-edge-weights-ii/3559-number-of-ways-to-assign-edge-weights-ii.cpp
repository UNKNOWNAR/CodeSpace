class Solution {
public:
    int mod = 1e9+7;
    int n;
    int cols;
    void dfs(vector<vector<int>>& adj,vector<vector<int>>& ancestorTable,vector<int>& depth,int root,int parent){
        ancestorTable[root][0] = parent;
        for(int next:adj[root]){
            if(next==parent)    continue;
            depth[next] = depth[root]+1;
            dfs(adj,ancestorTable,depth,next,root);
        }
    }
    void buildAncestorTable(vector<vector<int>>& ancestorTable){
        for(int j=1;j<cols;j++){
            for(int node=1;node<=n;node++){
                if(ancestorTable[node][j-1] != -1)
                    ancestorTable[node][j] = ancestorTable[ancestorTable[node][j-1]][j-1];
            }
        }
    }
    int findLCA(int u,int v,vector<int>& depth,vector<vector<int>>& ancestorTable){
        if(depth[u]<depth[v])
            swap(u,v);
        int k = depth[u] - depth[v];
        for(int j=0;j<cols;j++){
            if(k&(1<<j))
                u = ancestorTable[u][j];
        }
        if(u==v)
            return u;
        for(int j=cols-1;j>=0;j--){
            if(ancestorTable[u][j]==-1)
                continue;
            if(ancestorTable[u][j]!=ancestorTable[v][j]){
                u = ancestorTable[u][j];
                v = ancestorTable[v][j];
            }
        }
        return ancestorTable[u][0];
    }
    vector<int> assignEdgeWeights(vector<vector<int>>& edges, vector<vector<int>>& queries) {
        n = edges.size()+1;
        cols = log2(n)+1;
        vector<vector<int>> ancestorTable(n+1,vector<int>(cols,-1));
        vector<vector<int>> adj(n+1);
        for(auto e:edges){
            adj[e[0]].push_back(e[1]);
            adj[e[1]].push_back(e[0]);
        }
        vector<int> depth(n+1);
        dfs(adj,ancestorTable,depth,1,-1);
        buildAncestorTable(ancestorTable);
        vector<int> pow2(n+1);
        pow2[0] = 1;
        for(int i=1;i<=n;i++)
            pow2[i] = (2LL*pow2[i-1])%mod;
        vector<int> result;
        for(auto q:queries){
            int u = q[0];
            int v = q[1];
            int lca  = findLCA(u,v,depth,ancestorTable);
            int d = depth[u]+depth[v] - 2*depth[lca];
            if(d==0)
                result.push_back(0);
            else 
                result.push_back(pow2[d-1]);
        }
        return result;
    }

};