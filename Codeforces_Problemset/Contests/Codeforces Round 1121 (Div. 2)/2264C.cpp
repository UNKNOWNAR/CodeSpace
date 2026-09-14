#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
vector<ll> factorials;
vector<ll> harmonics;  
int mod;
ll power(ll base,ll exp){
    if(exp==0)
        return 1;
    base %= mod;
    ll half = power(base,exp/2);
    ll res = (half*half)%mod;
    if(exp%2==1)
        res = (res*base)%mod;
    return res;
}
ll inverse(ll n){
    return power(n,mod-2);
}
void solve() {
    int n;
    cin>>n;
    if(n==1){
        int x;
        cin>>x;
        cout<<0<<endl;
        return;
    }
    vector<ll> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    sort(all(arr));
    ll coeff = 0;
    for(int i=0;i<n-1;i++)
        coeff = (coeff+arr[i]*(harmonics[n-1]-harmonics[n-i-1]-1+mod+mod)%mod)%mod;
    coeff = (coeff+arr[n-1]*(harmonics[n-1])%mod)%mod;
    ll ans = (coeff*factorials[n-1])%mod;
    cout<<ans<<endl;
}

int main() {
    fast_io; 
    int t;
    cin >> t; 
    mod = 998244353;
    factorials.resize(2*1e5+1);
    factorials[0]=1;
    for(int i=1;i<=2*1e5;i++)
        factorials[i]=(factorials[i-1]*i)%mod;
    harmonics.resize(2*1e5+1);
    harmonics[1]=1;
    for(int i=2;i<=2*1e5;i++)
        harmonics[i]=(harmonics[i-1]+inverse(i))%mod;
    while (t--) {
        solve();
    }
    return 0;
}