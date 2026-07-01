class Solution {
    using ll = long long;
public:
    int getMinBulbs(int n, int brightness) {
        if (brightness <= 0) return 0;
        return (brightness + 2) / 3;
    }
    ll minEnergy(int n, int brightness, vector<vector<int>>& intervals) {
        if(intervals.empty()) return 0;
        ll min_bulbs = getMinBulbs(n,brightness);
        sort(intervals.begin(),intervals.end());
        ll total_time = 0;
        int current_start = intervals[0][0];
        int current_end = intervals[0][1];
        for(int i=1;i<intervals.size();i++){
            if (intervals[i][0] <= current_end)
                current_end = max(current_end, intervals[i][1]);
            else{
                total_time += (current_end - current_start + 1);
                current_start = intervals[i][0];
                current_end = intervals[i][1];
            }
        }
        total_time += (current_end - current_start + 1);
        return min_bulbs * total_time;
    }
};
