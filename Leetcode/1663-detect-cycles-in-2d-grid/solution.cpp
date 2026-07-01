class Solution {
public:
int m;
int n;
    bool containsCycle(vector<vector<char>>& grid) {
        m = grid.size();
        n = grid[0].size();
        vector<vector<bool>> visited(m, vector<bool>(n, false));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]&&check(i,j,grid,visited,-1,-1))
                    return true;
            }
        }
        return false;
    }
    bool check(int row,int col,vector<vector<char>>& grid,vector<vector<bool>>& visited,int prevRow,int prevCol){
        if(visited[row][col])
            return true;
        visited[row][col] = true;
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};
        for (int i = 0; i < 4; i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];
            if((newRow==m||newCol==n||newRow<0||newCol<0)||grid[newRow][newCol]!=grid[row][col]||(prevRow==newRow&&prevCol==newCol))
                continue;
            if(check(newRow,newCol,grid,visited,row,col))
                return true;
        }
        return false;
    }
};
