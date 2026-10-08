#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n,k;
    cin>>n>>k;
    if(n<=k){
        cout<<1<<endl;
        return;
    }
    ll ans = n;
    for(ll i=2;i*i<=n;i++){
        if(n%i==0){
            ll x = n/i;
            if(k>=i)
                ans = min(ans,x); 
            if(k>=x)
                ans = min(ans,i);
        }
    }
    cout<<ans<<endl;
    
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