class Solution {
public:
    vector<vector<int>> aggregateTimeSeries(vector<vector<int>>& series1, vector<vector<int>>& series2) {
        vector<vector<int>> merge;
        int val1 = 0,val2 = 0,n = series1.size(),i1 = series1.size()-1,i2 = series2.size()-1;
        while(i1>=0||i2>=0){
            if(i2<0||(i1>=0&&series2[i2][0]<series1[i1][0])) {
                merge.push_back({series1[i1][0],series1[i1][1]+val2});
                val1 = series1[i1][1];
                i1--;
            }
            else if(i1<0||series2[i2][0]>series1[i1][0]){
                merge.push_back({series2[i2][0],series2[i2][1]+val1});
                val2 = series2[i2][1];
                i2--;
            }
            else{
                merge.push_back({series2[i2][0],series2[i2][1]+series1[i1][1]});
                val1 = series1[i1][1];
                val2 = series2[i2][1];
                i1--;
                i2--;
            }
        }
        reverse(merge.begin(),merge.end());
        return merge;
    }
};