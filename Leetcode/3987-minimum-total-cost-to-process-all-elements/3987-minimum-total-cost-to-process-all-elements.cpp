class Solution {
    using ll = long long;
public:
    const int mod = 1e9+7;
    ll pow(ll x,ll y){
        ll res = 1;
        while(y>0){
            if(y&1)
                res = (1LL*res*x)%mod;
            x = (1LL*x*x)%mod;
            y /= 2;
        }
        return res;
    }
    ll inverse(int x){
        return pow(x,mod-2);
    }
    int minimumCost(vector<int>& nums, int k) {
        ll resources = k, times = 0,n = nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]>resources){
                ll deficeit = nums[i]-resources;
                ll x = (deficeit+k-1)/k;
                resources += k*x;
                times += x;
            }
                resources -= nums[i];
        }
        times = times%mod;
        ll min_cost = times%mod;
        min_cost = (1LL*min_cost*(times+1)%mod)%mod;
        min_cost = (1LL*min_cost*(inverse(2)%mod))%mod;
        return min_cost;
    }
};