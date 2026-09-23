#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
int spf(ll n){
    for(ll i=2;i*i<=n;i++){
        if(n%i==0)
            return i;
    }
    return n;
}
void solve() {
    ll n;
    cin>>n;   
    if(n&1){
        ll g = spf(n);
        if(g==n)//n is a prime number
            cout<<1<<" "<<n-1<<endl;   
        else {
            ll x = (n/g)/2;
            ll y = (n/g)/2+1;
            cout<<x*g<<" "<<y*g<<endl; 
        }
    } 
    else
        cout<<n/2<<" "<<n/2<<endl;
}
int main() {
    fast_io; 
    int t;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}