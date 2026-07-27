class Solution {
public:
    vector<int> findOrder(int n, vector<vector<int>>& prerequisites) {
        vector<vector<int>> adj(n);
        vector<int> indegree(n);
        vector<int> order;
        for(vector<int> prerequisite:prerequisites){
            adj[prerequisite[0]].push_back(prerequisite[1]);
            indegree[prerequisite[1]]++;
        }
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
        reverse(order.begin(),order.end());
        return order.size()==n?order:vector<int>();
    }
};