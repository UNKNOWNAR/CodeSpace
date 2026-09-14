class Solution {
    using ll = long long;
public:
    int missingInteger(vector<int>& nums) {
        int n = nums.size();
        ll sum = nums[0];
        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i - 1] + 1) 
                sum += nums[i];
            else
                break;
        }
        unordered_set<int> st(nums.begin(), nums.end());
        ll x = sum;
        while (st.count(x)) 
            x++;
        return x;
    }
};
