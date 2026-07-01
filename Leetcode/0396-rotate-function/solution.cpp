class Solution {
public:
    int maxRotateFunction(vector<int>& nums) {
        int n = nums.size();
        int sum = 0;
        for(auto x:nums)
            sum += x;
        int prev_f = 0;
        for(int i=0;i<n;i++)
            prev_f += i*nums[i];
        int ans = prev_f;
        for(int i=1;i<n;i++){
            prev_f = prev_f + sum - nums[n-i]*n;
            ans = max(ans,prev_f);
        }
        return ans;
    }
};
