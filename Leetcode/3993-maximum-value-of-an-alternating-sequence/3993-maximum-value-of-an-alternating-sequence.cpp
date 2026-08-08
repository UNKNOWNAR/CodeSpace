class Solution {
    using ll = long long;
public:
    ll maximumValue(int n, int s, int m) {
        if(n==1)
            return s;
        ll ans = s+(1LL*((n-2)/2)*(m-1))+m;
        return ans;
    }
};