class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        for(auto &num:nums)
            num = ((num%k)+k)%k;
        vector<int> cnt(k,0);
        cnt[0] = 1;
        int ans = 0,sum = 0;
        for(int i=0;i<nums.size();i++){
            sum = (sum+nums[i])%k;
            ans += cnt[sum];
            cnt[sum]++;
        }
        return ans;
    }
};