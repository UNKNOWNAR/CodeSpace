class Solution {
public:
    int m,n;
    void solve(vector<vector<char>>& board) {
        m = board.size();
        n = board[0].size();
        vector<vector<bool>> vis(m,vector<bool>(n));
        for(int i=0;i<m;i++)
            dfs(i,0,board,vis);
        for(int i=1;i<n;i++)
            dfs(m-1,i,board,vis);
        for(int i=m-2;i>=0;i--)
            dfs(i,n-1,board,vis);
        for(int i=n-2;i>=1;i--)
            dfs(0,i,board,vis);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'&&!vis[i][j])
                    board[i][j] = 'X';
            }
        }
    }
    void dfs(int r,int c,vector<vector<char>>& board,vector<vector<bool>>& vis){
        if(r==m||r<0||c==n||c<0||board[r][c]=='X'||vis[r][c])
            return;
        vis[r][c] = true;
        int dr[4] = {1,0,-1,0};
        int dc[4] = {0,-1,0,1};
        for(int i=0;i<4;i++)
            dfs(r+dr[i],c+dc[i],board,vis);
    }
};