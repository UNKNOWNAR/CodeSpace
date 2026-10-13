class Solution {
    #define ll long long
public:
    ll maxAlternatingSum(vector<int>& nums) {
        int n = nums.size();
        for(int &num:nums){
            if(num<0)
                num = num*-1;
        }
        sort(nums.begin(),nums.end());
        ll ans = 0;
        for(int i=n-1;i>=n/2;i--)
            ans += 1LL*nums[i]*nums[i];
        for(int i=0;i<n/2;i++)
            ans -= 1LL*nums[i]*nums[i];
        return ans;
    }
};