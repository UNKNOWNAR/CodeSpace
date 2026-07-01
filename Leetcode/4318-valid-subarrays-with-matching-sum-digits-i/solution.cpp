class Solution {
    using ll = long long;
public:
    int countValidSubarrays(vector<int>& nums, int x) {
        int n = nums.size();
        int valid_count = 0;
        for (int l = 0; l < n; ++l) {
            ll current_sum = 0;
            for (int r = l; r < n; ++r) {
                current_sum += nums[r];
                if (current_sum % 10 == x) {
                    ll temp = current_sum;
                    while (temp >= 10) {
                        temp /= 10;
                    }
                    if (temp == x) {
                        valid_count++;
                    }
                }
            }
        }
        return valid_count;
    }
};
