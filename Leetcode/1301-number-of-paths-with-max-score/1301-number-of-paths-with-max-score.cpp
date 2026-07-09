class Solution {
public:
    int n;
    int mod = 1e9+7;
     vector<vector<pair<int, int>>> t;
    bool isValid(int i,int j,vector<string>& board){
        if(i>=0&&i<n&&j>=0&&j<n&&board[i][j]!='X')
            return true;
        return false;
    }
    pair<int,int> solve(int i,int j,vector<string>& board){
        if(board[i][j]=='E')
            return {0,1};
        if(board[i][j]=='X')
            return {0,0};
        if (t[i][j] != make_pair(-1, -1))
            return t[i][j];
        int upScore = 0,upPath = 0;
        int leftScore = 0,leftPath = 0;
        int diagonalScore = 0,daigonalPath = 0;
        int val = (board[i][j]=='S'?0:board[i][j]-'0');
        if(isValid(i-1,j,board)){
            auto[score,paths] = solve(i-1,j,board);
            upPath = paths;
            if(upPath>0)
                upScore = score+val;
        }
        if(isValid(i-1,j-1,board)){
            auto[score,paths] = solve(i-1,j-1,board);
            daigonalPath = paths;
            if(daigonalPath>0)
                diagonalScore = score+val;
        }
        if(isValid(i,j-1,board)){
            auto[score,paths] = solve(i,j-1,board);
            leftPath = paths;
            if(leftPath>0)
                leftScore = score+val;
        }
        int bestScore = max(upScore,max(diagonalScore,leftScore));
        int bestPath = bestScore==upScore?upPath:0;
        bestPath += bestScore==diagonalScore?daigonalPath:0;
        bestPath += bestScore==leftScore?leftPath:0;
        t[i][j] = {bestScore, bestPath % mod};
        return t[i][j];
    }
    vector<int> pathsWithMaxScore(vector<string>& board) {
        n = board.size();
        t.assign(n, vector<pair<int, int>>(n, {-1, -1}));
        auto[score,paths] = solve(n-1,n-1,board);
        return {score,paths};
    }
};