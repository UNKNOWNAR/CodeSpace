class Solution {
public:
    vector<int> bobTime;
    vector<vector<int>> adj;
    bool Bobdfs(int node,int parent,int lvl){//Bobs way to the root
        if(node==0){
            bobTime[node] = lvl;
            return true;
        }
        for(int next:adj[node]){
            if(parent==next)
                continue;
            if(Bobdfs(next,node,lvl+1)){
                bobTime[node] = lvl;
                return true;
            }
        }
        return false;
    }
    int Alicedfs(int node,int parent,int lvl,vector<int>& amount){
        int bestChild = -1e9;
        for(int next:adj[node]){
            if(parent==next)
                continue;
            bestChild = max(bestChild,Alicedfs(next,node,lvl+1,amount));
        }
        int cost = 0;
        if(lvl<bobTime[node])
            cost += amount[node];
        else if(lvl==bobTime[node])
            cost += amount[node]/2;
        return bestChild==-1e9?cost:bestChild+cost;
    }
    int mostProfitablePath(vector<vector<int>>& edges, int bob, vector<int>& amount) {
        int n = amount.size();
        bobTime.assign(n,1e9);
        adj.resize(n);
        for(auto &e:edges){
            adj[e[0]].push_back(e[1]);
            adj[e[1]].push_back(e[0]);
        }
        Bobdfs(bob,-1,0);
        return Alicedfs(0,-1,0,amount);
    }
};