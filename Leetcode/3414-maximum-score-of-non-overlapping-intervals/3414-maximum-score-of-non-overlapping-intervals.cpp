class Solution {
public:
    using ll = long long;
    struct Node{
        ll score = -1;
        vector<int> indx;
    };
    int n;
    vector<int> maximumWeight(vector<vector<int>>& intervals) {
        n = intervals.size();
        vector<int> nexTindx;
        for(int i=0;i<n;i++)
            intervals[i].push_back(i);
        sort(begin(intervals),end(intervals));
        nexTindx.resize(n);
        for(int i=0;i<n;i++){
            int end = intervals[i][1];
            nexTindx[i] = findNext(intervals,end);
        }
        vector<vector<Node>> dp(n+1,vector<Node>(5));
        Node temp;
        temp.score = 0;
        for(int i=0;i<n;i++)
            dp[i][0] = temp;
        for(int k=0;k<=4;k++)
            dp[n][k] = temp;
        for (int i=n-1;i>=0;i--){
            for(int k=1;k<=4;k++){
                Node skip = dp[i+1][k];
                ll wt = intervals[i][2];
                int idx = intervals[i][3];
                int j = nexTindx[i];
                Node temp = dp[j][k-1];
                Node take;
                take.score = wt+temp.score;
                take.indx = temp.indx;
                take.indx.push_back(idx);
                sort(begin(take.indx),end(take.indx));
                Node result;
                if(take.score>skip.score)
                    result = take;
                else if(take.score<skip.score)
                    result = skip;
                else 
                    result = (skip.indx<take.indx)?skip:take;
                dp[i][k] = result;
            }
        }
        return dp[0][4].indx;
    }
    int findNext(vector<vector<int>>& intervals,int end){
        int low = 0,high = n-1,result = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(end<intervals[mid][0]){
                result = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return result;
    }
};