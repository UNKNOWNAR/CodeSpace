class Solution {
public:
    vector<string> createGrid(int m, int n, int k) {
        vector<string> grid;
        for(int i=0;i<m;i++){
            if(i==0)
                grid.push_back(string(n,'.'));//all free cell
            else 
                grid.push_back(string(n-1,'#')+'.');//n-1 obstacles and last cell free
        }

        if(k>=2){
            if(m>=2&&n>=2)
                grid[1][n-2] = '.';
            else
                return {};
        }

        if(k>=3){
            if(m>=3&&m>=n)
                grid[2][n-2] = '.';
            else if(n>=3&&n>m)
                grid[1][n-3] = '.';
            else
                return {};
        }

        if(k==4){
            if(m>=4&&m>=n)
                grid[3][n-2] = '.';
            else if(n>=4&&n>m)
                grid[1][n-4] = '.';
            else if(m==3&&n==3)
                return {"..#","...","#.."};
            else
                return {};
        }
        return grid;
    }
};