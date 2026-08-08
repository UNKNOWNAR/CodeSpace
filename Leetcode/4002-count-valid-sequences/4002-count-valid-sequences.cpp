class Solution {
public:
    using ll = long long;
    static const int mod = 1e9+7;
    vector<ll> factorial;
    void fac(int n){
        factorial[0] = 1;
        for (int i=1;i<=n;i++)
            factorial[i] = factorial[i - 1] * i % mod;
    }
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
    int ncr(int n,int r){
        if(r<0||r>n)
            return 0;
        ll ans = factorial[n];
        ans = ans * inverse(factorial[n - r]) % mod;
        ans = ans * inverse(factorial[r]) % mod;
        return ans;
    }
    int countValidSequences(int n, int k) {
        factorial = vector<ll>(n+1);
        fac(n);
        ll total = ncr(n-1,k-1);
        ll odd = 0;
        if((n-k)%2==0)
            odd = ncr((n-k)/2+k-1,k-1);
        return (total-odd+mod)%mod;
    }
};