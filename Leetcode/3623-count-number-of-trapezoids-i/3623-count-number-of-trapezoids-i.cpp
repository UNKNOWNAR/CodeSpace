class Solution {
public:
    using ll = long long;
    const int mod = 1e9+7;
    int countTrapezoids(vector<vector<int>>& points) {
        map<int,int> freq;
        for(auto point:points)
            freq[point[1]]++;
        vector<ll> vals;
        ll sum = 0;
        for(auto [x,f]:freq){
            if(f<2)
                continue;
            ll ways = ((1LL*f*(f-1))/2)%mod;
            sum = (sum+ways)%mod;
            vals.push_back(ways);
        }
        ll ans = 0;
        for(auto x:vals){
            sum -= x;
            ans = (ans+1LL*x*sum)%mod;
        }
        return ans;
    }
};