class Solution {
    using ll = long long;
public:
    ll minArraySum(vector<int>& nums) {
        int maxVal = *max_element(nums.begin(),nums.end());
        sort(nums.begin(), nums.end());
        vector<int> spf(maxVal + 1,-1);
        ll sum = 0;
        for(int num:nums){
            if (spf[num] != -1) continue;
            for (int multiple = num; multiple <= maxVal; multiple += num) {
                if (spf[multiple] == -1) {
                spf[multiple] = num;
                }
            }
        }
        for(int num:nums)
            sum += spf[num];
        return sum;
    }
};
