class Solution {
public:
    int mod = 1e9+7;
    using ll = long long;
    int pow(ll base,ll exp){
        if(exp==0)
            return 1;
        ll half = pow(base,exp/2);
        ll res = (half*half)%mod;
        if(exp%2==1)
            res = (res*base)%mod;
        return res;
    }   
    int getMaxDepth(vector<vector<int>>& adj,int node,int parent){
        int depth = 0;
        for(int next:adj[node]){
            if(next==parent)    continue;
            depth = max(depth,getMaxDepth(adj,next,node)+1);
        }
        return depth;
    }
    int assignEdgeWeights(vector<vector<int>>& edges) {
        int n = edges.size()+1;
        vector<vector<int>> adj(n+1);
        for(auto edge:edges){
            adj[edge[0]].push_back(edge[1]);
            adj[edge[1]].push_back(edge[0]);
        }
        int d = getMaxDepth(adj,1,-1);
        return pow(2,d-1);
    }
};