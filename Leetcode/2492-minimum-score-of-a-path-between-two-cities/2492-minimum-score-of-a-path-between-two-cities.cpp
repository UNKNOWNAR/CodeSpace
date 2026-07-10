class Solution {
public:
    int min_val = 1e9;
    int n;
    void dfs(int indx,vector<vector<pair<int,int>>>& adj,vector<bool>& visited){
        visited[indx] = true;
        for(auto &x:adj[indx]){
            min_val = min(min_val, x.second);
            if(visited[x.first])
                continue;
            dfs(x.first,adj,visited);
        }
    }
    int minScore(int n, vector<vector<int>>& roads) {
        this->n = n;
        vector<vector<pair<int,int>>> adj(n+1);
        for(auto &road:roads){
            int u = road[0];
            int v = road[1];
            int edge = road[2];
            adj[u].push_back({v,edge});
            adj[v].push_back({u,edge});
        }
        vector<bool> visited(n+1,false);
        dfs(1,adj,visited);
        return min_val;
    }
};