class Solution {
public:
    int findCheapestPrice(int n, vector<vector<int>>& flights,int src, int dst, int k) {
        vector<vector<pair<int,int>>> adj(n);
        for (auto &flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int w = flight[2];
            adj[u].push_back({v, w});
        }
        queue<pair<int, pair<int,int>>> q;
        q.push({0, {src, 0}});
        vector<int> dist(n, 1e9);
        dist[src] = 0;
        while (!q.empty()) {
            auto [stops, p] = q.front();
            q.pop();
            auto [u, cost] = p;
            if (stops > k)
                continue;
            for (auto &[v, wt] : adj[u]) {
                if (cost + wt < dist[v]) {
                    dist[v] = cost + wt;
                    q.push({stops + 1, {v, dist[v]}});
                }
            }
        }
        return (dist[dst] == 1e9) ? -1 : dist[dst];
    }
};