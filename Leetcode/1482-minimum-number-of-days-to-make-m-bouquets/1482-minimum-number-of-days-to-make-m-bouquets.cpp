class Solution {
    using ll = long long;
public:
    int minDays(vector<int>& bloomDay, int m, int k) {
        ll ans = -1,low = low = *min_element(bloomDay.begin(), bloomDay.end()),high = *max_element(bloomDay.begin(),bloomDay.end());
        if ((long long)m * k > bloomDay.size())
            return -1;
        while(low<=high){
            ll mid = low + (high-low)/2;
            if(check(mid,bloomDay,m,k)){
                high = mid-1;
                ans = mid;
            }
            else
                low = mid+1;
        }
        return ans;
    }
    bool check(int day,vector<int>& bloomDay, int m, int k){
        int count = 0,adj = 0;
        for(int bloom:bloomDay){
            if(day<bloom){
                adj = 0;
                continue;
            }
            adj++;
            if(adj==k){
                count++;
                adj = 0;
            }
            if(count==m)
                return true;
        }
        return false;
    }
};