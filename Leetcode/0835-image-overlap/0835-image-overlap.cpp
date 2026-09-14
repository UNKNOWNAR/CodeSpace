class Solution {
public:
    int largestOverlap(vector<vector<int>>& img1, vector<vector<int>>& img2) {
        int n = img1.size();
        int max_match = 0;
        for(int row_offset=-n+1;row_offset<n;row_offset++){
            for(int col_offset=-n+1;col_offset<n;col_offset++){
                int match = 0;
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        int i2 = i+row_offset;
                        int j2 = j+col_offset;
                        if(i2<0||j2<0||i2>=n||j2>=n)
                            continue;
                        if(img1[i][j]==img2[i2][j2]&&img1[i][j]==1)
                            match++;
                    }
                }
                max_match = max(max_match,match);
                
            }
        }
        return max_match;
    }
};