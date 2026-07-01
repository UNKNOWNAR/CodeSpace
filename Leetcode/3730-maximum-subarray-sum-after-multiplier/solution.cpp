class Solution {
    using ll = long long;
public:
    ll INF = -1e18;
    int k;
    ll solve(vector<int>& nums,bool isMultiply){
        int n = nums.size();
        ll s0 = nums[0];
        ll s1 = isMultiply ? (1LL * nums[0] * k) : (nums[0] / k);
        ll s2 = s1; 
        ll maxOverall = max({s0, s1, s2});
        for (int i = 1; i < n; ++i) {
            ll orig = nums[i];
            ll trans = isMultiply ? (orig * k) : (orig / k);
            s0 = max(orig, s0 + orig);
            s1 = max({trans, s0 - orig + trans, s1 + trans});
            s2 = max(s1, s2 + orig);
            maxOverall = max({maxOverall, s0, s1, s2});
        }
        return maxOverall;
    }
    ll maxSubarraySum(vector<int>& nums, int k) {
        this->k = k;
        return max(solve(nums,true),solve(nums,false));
    }
};
