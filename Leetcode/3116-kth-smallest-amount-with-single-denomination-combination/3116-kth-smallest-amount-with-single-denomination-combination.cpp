class Solution {
    using ll = long long;
public:
    ll findKthSmallest(vector<int>& coins, int k) {
        ll l = 1,h = 1LL*(*max_element(coins.begin(),coins.end()))*k;
        while(l<=h){
            ll mid = l+(h-l)/2;
            if(check(mid,coins)>=k)
                h = mid-1;
            else
                l = mid+1;
        }
        return l;
    }
    ll check(ll mid,vector<int>& coins){
        ll correctedCount = 0;
        int n = coins.size();
        for(int exp=1;exp<=(1<<n)-1;exp++){
            ll lcm = 0;
            ll order = 0;
            for(int i=0;i<n;i++){
                if(exp&(1<<i)){
                    order++;
                    if(lcm == 0)
                        lcm = coins[i];
                    else
                        lcm = lcm*coins[i]/gcd(lcm,coins[i]);
                }
            }
            if(order%2==0)
                correctedCount -= mid/lcm;
            else
                correctedCount += mid/lcm;
        }
        return correctedCount;
    }
};