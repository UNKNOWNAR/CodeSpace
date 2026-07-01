class Solution {
    int m,n;
public:
    int minOperations(vector<vector<int>>& grid, int x) {
        int low = 1;
        int high = 1;
        m = grid.size();
        n = grid[0].size();
        vector<int> sorted;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                sorted.push_back(grid[i][j]);
        }
        sort(sorted.begin(),sorted.end());
        int target = sorted[m*n/2];
        int ops = 0;
        for(int &num: sorted){
            if((num%x)!=(target%x))
                return -1;
            ops += abs((target-num)/x);
        }
        return ops;
    }
};
