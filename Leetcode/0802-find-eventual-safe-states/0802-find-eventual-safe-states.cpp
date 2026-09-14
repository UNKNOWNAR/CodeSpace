class Solution {
public:
    vector<int> eventualSafeNodes(vector<vector<int>>& graph) {
        int n = graph.size();
        vector<int> indegree(n);
        vector<vector<int>> adj(n);
        for(int i=0;i<n;i++){
            for(int node:graph[i])
                adj[node].push_back(i);
        }
        for(vector<int> nodes:adj){
            for(int node:nodes)
                indegree[node]++;
        }
        vector<int> order;
        queue<int> q;
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
                q.push(i);
        }
        while(!q.empty()){
            int node = q.front();
            q.pop();
            for(int next:adj[node]){
                indegree[next]--;
                if(indegree[next]==0)
                    q.push(next);
            }
            order.push_back(node);
        }
        sort(order.begin(),order.end());
        return order;
    }
};