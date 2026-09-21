class Solution {
public:
    using ll = long long;
    vector<ll> resultArray(vector<int>& nums, int k) {
        int n = nums.size();
        vector<ll> res(k),prev(k),ans(k);
        res[nums[0]%k]++;
        ans[nums[0]%k]++;
        for(int i=1;i<n;i++){
            prev = res;
            vector<ll> temp(k);
            for(int j=0;j<k;j++)
                temp[(1LL*j*nums[i]%k)%k]+=prev[j];
            res = temp;
            res[nums[i]%k]++;
            for(int j=0;j<k;j++)
                ans[j] += res[j];
        }
        return ans;
    }
};