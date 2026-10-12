class Solution {
public:
    using ll = long long;
    vector<ll> isPrime;
    void sieve(ll n){
        for(ll i=2;i<=n;i++){
            if(isPrime[i]){
                for(ll j=i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }
    vector<int> maxPrimes(int n, int s) {
        isPrime.resize(n+1,true);
        isPrime[0] = false;
        isPrime[1] = false;
        sieve(n);
        vector<int> ans;
        for(int i=2;i<=n;i++){
            if(s<i)
                break;
            if(isPrime[i]){
                ans.push_back(i);
                s-=i;
            }
        }
        return ans;
    }
};