class Solution {
public:
    bool isBipartite(vector<vector<int>>& graph) {
        int n = graph.size();
        vector<int> colors(n,-1);
        for(int i=0;i<n;i++){
            if(colors[i]!=-1)
                continue;
            queue<int> q;
            q.push(i);
            colors[i] = 1;
            while(!q.empty()){
                int node = q.front();
                q.pop();
                for(int i=0;i<graph[node].size();i++){
                    if(colors[node]==colors[graph[node][i]])
                        return false;
                    if(colors[graph[node][i]]!=-1)
                        continue;
                    colors[graph[node][i]] = colors[node]==1?0:1;
                    q.push(graph[node][i]);
                }
            }
        }
        return true;
    }
};