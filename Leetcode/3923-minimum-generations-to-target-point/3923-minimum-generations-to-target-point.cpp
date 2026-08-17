class Solution {
public:
    int minGenerations(vector<vector<int>>& points, vector<int>& target) {
        int n = points.size();
        vector<vector<vector<int>>> exists(7,vector<vector<int>>(7,vector<int>(7)));
        vector<vector<int>> currentpts;
        bool found = false;
        for(int i=0;i<n;i++){
            if(!exists[points[i][0]][points[i][1]][points[i][2]]){
                exists[points[i][0]][points[i][1]][points[i][2]] = true;
                currentpts.push_back(points[i]);
            }
        }
        if(exists[target[0]][target[1]][target[2]])
            return 0;
        int k = 0;
        while(true){
            k++;
            n = currentpts.size();
            int new_points = 0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int nx = (currentpts[i][0] + currentpts[j][0]) / 2;
                    int ny = (currentpts[i][1] + currentpts[j][1]) / 2;
                    int nz = (currentpts[i][2] + currentpts[j][2]) / 2;
                    if(!exists[nx][ny][nz]){
                        exists[nx][ny][nz] = true;
                        currentpts.push_back({nx,ny,nz});
                        new_points++;
                    }
                }
            }
            if(exists[target[0]][target[1]][target[2]])
                return k;
            if(new_points==0)
                break;
        }
        return -1;
    }
};