class Solution {
public:
    int shortestPath(int n, vector<vector<int>>& edges, string labels, int k) {
        vector<vector<pair<int, int>>> adj(n);
        for (const auto& edge : edges) {
            adj[edge[0]].push_back({edge[1], edge[2]});
        }
        const int INF = 1e9;
        vector<vector<int>> dist(n, vector<int>(k + 1, INF));
        priority_queue<tuple<int, int, int>, vector<tuple<int, int, int>>, greater<tuple<int, int, int>>> pq;
        dist[0][1] = 0;
        pq.push({0, 0, 1});
        
        while (!pq.empty()) {
            auto [d, u, c] = pq.top();
            pq.pop();
            if (d > dist[u][c]) continue;
            if(u==n-1)  return d;
            for (const auto& [v, w] : adj[u]) {
                int next_c = (labels[v] == labels[u]) ? c + 1 : 1;
                if (next_c <= k) {
                    if (d + w < dist[v][next_c]) {
                        dist[v][next_c] = d + w;
                        pq.push({dist[v][next_c], v, next_c});
                    }
                }
            }
        }
        return -1;
    }
};
