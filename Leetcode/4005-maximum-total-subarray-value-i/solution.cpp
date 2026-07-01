class Solution {
    using ll = long long;
public:
    long long maxTotalValue(vector<int>& nums, int k) {
        ll min_val = *min_element(nums.begin(),nums.end());
        ll max_val = *max_element(nums.begin(),nums.end());
        return k*(max_val-min_val);
    }
};
