class Solution {
public:
    using ll = long long;
    struct Node{
        ll score = -1;
        vector<int> indx;
    };
    int n;
    vector<vector<Node>> dp;
    vector<int> nexTindx;
    Node solve(vector<vector<int>>& intervals,int i,int k){
        if(k==0||i==n){
            Node temp;
            temp.score = 0;
            return temp;
        }
        if(dp[i][k].score!=-1)
            return dp[i][k];
        Node skip = solve(intervals,i+1,k);
        ll wt = intervals[i][2];
        int idx = intervals[i][3];
        int j = nexTindx[i];
        Node temp = solve(intervals,j,k-1);
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
        return dp[i][k] = result;
    }
    vector<int> maximumWeight(vector<vector<int>>& intervals) {
        n = intervals.size();
        dp.assign(n+1,vector<Node>(5));
        for(int i=0;i<n;i++)
            intervals[i].push_back(i);
        sort(begin(intervals),end(intervals));
        nexTindx.resize(n);
        for(int i=0;i<n;i++){
            int end = intervals[i][1];
            nexTindx[i] = findNext(intervals,end);
        }
        return solve(intervals,0,4).indx;
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