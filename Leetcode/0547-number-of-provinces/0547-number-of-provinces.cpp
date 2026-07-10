class Solution {
public:
    int n;
    int findCircleNum(vector<vector<int>>& isConnected) {
        n = isConnected.size();
        vector<bool> visited(n);
        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
    void dfs(int v,vector<vector<int>>& isConnected,vector<bool>& visited){
        visited[v] = true;
        for(int i=0;i<n;i++){
            if(!visited[i]&&isConnected[v][i]==1)
                dfs(i,isConnected,visited);
        }
    }
};