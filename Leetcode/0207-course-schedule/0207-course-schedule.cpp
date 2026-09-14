class Solution {
public:
    int n;
    bool canFinish(int n, vector<vector<int>>& prerequisites) {
        this->n = n;
        vector<vector<int>> adj(n);
        for(vector<int> prerequisite:prerequisites)
            adj[prerequisite[0]].push_back(prerequisite[1]);
        vector<bool> vis(n);
        vector<bool> path_vis(n);
        for(int i=0;i<n;i++){
            if(!dfs(i,adj,vis,path_vis))
                return false;
        }
        return true;
    }
    bool dfs(int node,vector<vector<int>>& adj,vector<bool>& vis,vector<bool>& path_vis){
        if(vis[node]){
            if(path_vis[node])
                return false;
            return true;
        }
        vis[node] = true;
        path_vis[node] = true;
        bool flag = true;
        for(int next:adj[node]){
            flag = flag&dfs(next,adj,vis,path_vis);
            if(!flag)
                return false;
        }
        path_vis[node] = false;
        return flag;
    }
};