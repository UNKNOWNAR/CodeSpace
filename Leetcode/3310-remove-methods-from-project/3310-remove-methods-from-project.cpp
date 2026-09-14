class Solution {
public:
    int n;
    void dfs(int node,vector<vector<int>>& adj,vector<bool>& sus){
        sus[node] = true;
        for(int next:adj[node]){
            if(!sus[next])
                dfs(next,adj,sus);
        }
    }
    bool dfs(int node,vector<vector<int>>& adj,vector<bool>& sus,vector<bool>& vis){
        if(sus[node])
            return true;
        vis[node] = true;
        bool res = false;
        for(int next:adj[node]){
            if(!vis[next])
                res |= dfs(next,adj,sus,vis);
        }
        return res;
    }
    vector<int> remainingMethods(int n, int k, vector<vector<int>>& invocations) {
        this->n = n;
        vector<vector<int>> adj(n);
        for(auto x:invocations)
            adj[x[0]].push_back(x[1]);
        vector<bool> sus(n);
        vector<bool> vis(n);
        vector<int> keep;
        dfs(k,adj,sus);
        bool connected = false;
        for(int i=0;i<n;i++){
            if(!sus[i]){
                keep.push_back(i);
                if(!connected)
                    connected |= dfs(i,adj,sus,vis);
            }
        }
        if(connected){
            for(int i=0;i<n;i++){
                if(sus[i])
                    keep.push_back(i);
            }
        }
        return keep;
    }
};