class Solution {
public:
    int removeCoveredIntervals(vector<vector<int>>& intervals) {
        int n = intervals.size();
        sort(intervals.begin(), intervals.end(), [](const vector<int>& a, const vector<int>& b) {
            if (a[0] == b[0]) return a[1] > b[1];
            return a[0] < b[0];
        });
        vector<vector<int>> answer;
        answer.push_back({intervals[0][0],intervals[0][1]});
        for(int i=1;i<n;i++){
            int c = intervals[i][0];
            int d = intervals[i][1];
            bool flag = true;
            for(auto &it:answer){
                int a = it[0];
                int b = it[1];
                if(c>=a&&b>=d){
                    flag = false;
                    break;
                }
            }
            if(flag)
                answer.push_back({c,d});
        }
        return answer.size();
    }
};