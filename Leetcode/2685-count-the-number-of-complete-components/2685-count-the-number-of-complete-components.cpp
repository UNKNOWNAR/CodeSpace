class Solution {
public:
    int countCompleteComponents(int n, vector<vector<int>>& edges) {
        vector<vector<int>> adj(n);
        vector<bool> visited(n);
        map<int,vector<int>> componenet;
        for(auto &edge:edges){
            int u = edge[0];
            int v = edge[1];
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            int nodes = 0,edges = 0;
            if(!visited[i]){
                dfs(i,adj,visited,nodes,edges);
                if(nodes*(nodes-1)==edges)
                    count++;
            }
        }
        return count;
    }
    void dfs(int v,vector<vector<int>>& adj,vector<bool>& visited, int& nodes, int& edges){
        visited[v] = true;
        nodes++;
        edges += adj[v].size();
        for(auto &x:adj[v]){
            if(!visited[x])
                dfs(x,adj,visited,nodes,edges);
        }
    }
};