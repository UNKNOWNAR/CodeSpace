class Solution {
    using ll = long long;
public:
    ll dfs(int node, const vector<vector<int>>& adj, const vector<int>& baseTime, vector<long long>& finishTime){
        if (adj[node].empty()) {
            finishTime[node] = baseTime[node];
            return finishTime[node];
        }
        ll earliest = LLONG_MAX;
        ll latest = LLONG_MIN;
        for (int child : adj[node]) {
            long long childFinish = dfs(child, adj, baseTime, finishTime);
            earliest = min(earliest, childFinish);
            latest = max(latest, childFinish);
        }
        ll ownDuration = (latest - earliest) + baseTime[node];
        finishTime[node] = latest + ownDuration;
        return finishTime[node];
    }
    ll finishTime(int n, vector<vector<int>>& edges, vector<int>& baseTime) {
        vector<vector<int>> adj(n);
        for(auto &edge:edges)
            adj[edge[0]].push_back(edge[1]);
        vector<ll> finishTime(n, 0);
        return dfs(0, adj, baseTime, finishTime);
    }
};
