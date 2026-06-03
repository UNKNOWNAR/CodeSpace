#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve(vector<ll> &primes) {
    int n;
    cin>>n;
    ll prev = 1;
    int indx = 0;
    while(n--){
        ll ans = 1LL*prev*primes[indx++];
        cout<<ans<<" ";
        prev = primes[indx-1];
    }
    cout<<endl;
}
bool isPrime(ll num){//O(srt(N))
    for(ll i=2;i*i<=num;i++){
        if(num%i==0)
            return false;
    }
    return true;
}
int main() {
    fast_io; 
    int limit = 1e4+1;
    vector<ll> primes(limit);
    primes[0] = 1;
    int indx = 1;
    ll num = 2;
    while(indx<limit){//O(Nsqrt(N))
        if(isPrime(num))
            primes[indx++] = num;
        num++;
    }
    int t;
    cin >> t; 
    while (t--) {
        solve(primes);
    }
    return 0;
}