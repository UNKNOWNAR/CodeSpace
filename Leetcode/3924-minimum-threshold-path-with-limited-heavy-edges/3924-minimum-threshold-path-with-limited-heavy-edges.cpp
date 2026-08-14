class Solution {
    using ll = long long;
public:
    bool check(int n, int threshold,vector<vector<pair<int,int>>>& adj, int source, int target, int k){
        deque<pair<int,int>> dq;//node distance
        dq.push_front({source,0});
        vector<int> dis(n,1e9);
        dis[source] = 0;
        while(!dq.empty()){
            auto [u,dist] = dq.front();
            if(u == target) return dist<=k;
            dq.pop_front();
            if(dist>dis[u]) continue;
            for(auto [v,wt]:adj[u]){
                int ndist = dist+(wt>threshold?1:0);
                if(ndist<dis[v]){
                    dis[v] = ndist;
                    if(ndist==dist)
                        dq.push_front({v,ndist});
                    else
                        dq.push_back({v,ndist});
                }
            }
        }
        return false;
    }
    int minimumThreshold(int n, vector<vector<int>>& edges, int source, int target, int k) {
        if(source==target)
            return 0;
        vector<vector<pair<int,int>>> adj(n);
        ll low = 0,high = 0,ans = -1;
        for(auto edge:edges){
            adj[edge[0]].push_back({edge[1],edge[2]});
            adj[edge[1]].push_back({edge[0],edge[2]});
            high = max(1LL*edge[2],high);
        }
        while(low<=high){
            ll mid = low + (high-low)/2;
            if(check(n,mid,adj,source,target,k)){
                high = mid-1;
                ans = mid;
            }
            else
                low = mid+1;
        }
        return ans;
    }
};