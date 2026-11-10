class Solution {
public:
    int countServers(vector<vector<int>>& grid) {
        int m = grid.size(),n = grid[0].size();
        vector<int> rowserversCount(m),colserversCount(n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                rowserversCount[i] += grid[i][j];
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++)
                colserversCount[j] += grid[i][j];
        }
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                count += (rowserversCount[i]>1|colserversCount[j]>1)&grid[i][j];
        }
        return count;
    }
};