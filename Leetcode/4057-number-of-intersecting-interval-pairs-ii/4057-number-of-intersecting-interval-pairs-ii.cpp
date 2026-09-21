class Solution {
public:
    using ll = long long;
    ll countIntersectingIntervals(vector<vector<int>>& intervals) {
        ll count = 0;
        int n = intervals.size();
        sort(intervals.begin(),intervals.end());
        vector<int> start(n),end(n);
        for(int i=0;i<n;i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        for(int i=0;i<n;i++){
            int indx1 = lower_bound(end.begin()+i+1,end.end(),start[i])-end.begin();
            int indx2 = upper_bound(start.begin()+i+1,start.end(),end[i])-start.begin();
            count += min(n-indx1,indx2-i-1);
        }
        return count;
    }
};