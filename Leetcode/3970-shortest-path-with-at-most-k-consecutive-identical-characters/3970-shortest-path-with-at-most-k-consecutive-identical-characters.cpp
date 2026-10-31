class Solution {
public:
    struct stateValues{
        int v;
        int d;
        int count;
        bool operator>(const stateValues& other) const{ 
            return d > other.d;
        };
    };
    int shortestPath(int n, vector<vector<int>>& edges, string labels, int k) {
        vector<vector<pair<int,int>>> adj(n,vector<pair<int,int>>());
        for(auto &edge:edges)
            adj[edge[0]].push_back({edge[1],edge[2]});
        priority_queue<stateValues,vector<stateValues>,greater<stateValues>> minHeap;
        vector<vector<int>> dist(n,vector<int>(k+1,1e9));
        dist[0][1] = 0;
        minHeap.push({0,0,1});
        while(!minHeap.empty()){
            auto [v,d,count] = minHeap.top();
            minHeap.pop();
            if(dist[v][count]<d)
                continue;
            if(v==n-1)
                return d;
            for(auto &vec:adj[v]){
                int next = vec.first;
                int wt = vec.second;
                int newCount = (labels[next]==labels[v])?count+1:1;
                if(newCount>k)
                    continue;
                int newDist = d+wt;
                if(newDist<dist[next][newCount]){
                    dist[next][newCount] = newDist;
                    minHeap.push({next,newDist,newCount});
                }
            }
        }
        return -1;
    }
};