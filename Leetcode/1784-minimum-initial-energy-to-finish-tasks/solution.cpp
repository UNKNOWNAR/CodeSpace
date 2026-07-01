class Solution {
    using ll = long long;
public:
    int minimumEffort(vector<vector<int>>& tasks) {
        ll low = 0,high = 0;
        sort(tasks.begin(), tasks.end(), [](const vector<int>& a, const vector<int>& b) {
        return (a[1] - a[0]) > (b[1] - b[0]);});
        for(auto &task:tasks){
            low += 1LL*task[0];
            high += 1LL*task[1];
        }
        ll ans = high;
        while(low<=high){
            ll mid = low+(high-low)/2;
            if(check(tasks,mid)){
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
        return ans;
    }
    bool check(vector<vector<int>>& tasks,ll mid){
        for(auto task:tasks){
            if(mid>=task[1])
                mid -= task[0];
            else
                return false;
        }
        if(mid<0)
            return false;
        return true;
    }
};
