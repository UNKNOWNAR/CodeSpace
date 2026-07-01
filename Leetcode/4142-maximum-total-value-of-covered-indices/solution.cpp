class Solution {
    using ll = long long;
public:
    ll maxTotal(vector<int>& nums, string s) {
        int n = nums.size();
        ll INF = 1e18;
        vector<ll> dp(3, -INF);
        if(s[0]=='1'){
            dp[1] = nums[0];
            dp[2] = -INF;
        }
        else{
            dp[0] = 0;
            dp[2] = nums[0];
        }
        for(int i=1;i<n;i++){
            vector<ll> next_dp(3, -INF);
            if (s[i] == '1') {
                ll max_prev = max(dp[0], dp[1]);
                if (max_prev >= 0 || max_prev != -INF) 
                    next_dp[1] = max(next_dp[1], max_prev + nums[i]);
                if (dp[2] != -INF) {
                    next_dp[0] = max(next_dp[0], dp[2]);
                    next_dp[2] = max(next_dp[2], dp[2] + nums[i]);
                }
            }
            else{
                ll max_prev = max(dp[0], dp[1]);
                if (max_prev >= 0 || max_prev != -INF) 
                    next_dp[0] = max(next_dp[0], max_prev);
                if (max_prev >= 0 || max_prev != -INF) 
                    next_dp[2] = max(next_dp[2], max_prev + nums[i]);
            }
            dp = next_dp;
        }
        return max(dp[0], dp[1]);
    }
};
