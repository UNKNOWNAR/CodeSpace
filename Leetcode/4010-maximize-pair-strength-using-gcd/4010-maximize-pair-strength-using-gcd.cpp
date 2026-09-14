class Solution {
    using ll = long long;
public:
    ll maxPairStrength(vector<int>& nums) {
        int n = nums.size();
        ll ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    continue;
                ll g = gcd(nums[i],nums[j]);
                ans = max(1LL*nums[i]*nums[j]/(g*g),ans);
            }
        }
        return ans;
    }
};