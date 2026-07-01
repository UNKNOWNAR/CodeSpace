class Solution {
public:
    vector<vector<int>> filterOccupiedIntervals(vector<vector<int>>& occupiedIntervals, int freeStart, int freeEnd) {
        vector<vector<int>> merged,ans;
        sort(occupiedIntervals.begin(),occupiedIntervals.end());
        int n = occupiedIntervals.size();
        int start = occupiedIntervals[0][0],end = occupiedIntervals[0][1];
        for(int i=1;i<n;i++){
            if(occupiedIntervals[i][0] <= end + 1){
                start = min(start,occupiedIntervals[i-1][0]);
                end = max(end,occupiedIntervals[i][1]);
            }
            else{
                merged.push_back({start,end});
                start = occupiedIntervals[i][0];
                end = occupiedIntervals[i][1];
            }
        }
        merged.push_back({start,end});
        for(auto &it:merged){
            int curStart = it[0];
            int curEnd = it[1];
            if (curEnd < freeStart) 
                ans.push_back({curStart, curEnd});
            else if (curStart > freeEnd) 
                ans.push_back({curStart, curEnd});
            else{
                if (curStart < freeStart) 
                    ans.push_back({curStart, freeStart - 1});
                if (curEnd > freeEnd) 
                    ans.push_back({freeEnd + 1, curEnd});
            }
        }
        return ans;
    }
};
