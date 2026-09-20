class Solution {
public:
    using ll = long long;
    ll countIntersectingIntervals(vector<vector<int>>& intervals) {
        int n = intervals.size();
        ll count = 0;
        sort(intervals.begin(),intervals.end());
        vector<int> starts(n);
        for(int i=0;i<n;i++)
            starts[i] = intervals[i][0];
        for(int i=0;i<n;i++){
            auto it = upper_bound(starts.begin() + i + 1, starts.end(), intervals[i][1]);
            count += distance(starts.begin() + i + 1, it);
        }
        return count;
    }
};