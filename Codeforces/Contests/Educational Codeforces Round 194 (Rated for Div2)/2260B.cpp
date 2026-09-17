#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll x,y,k;
    cin>>x>>y>>k;
    ll d = y-x;
    if(d==0){
        cout<<0<<endl;
        return;
    }
    ll cnt = min(k, max(0LL, d - x + 1));
    ll ans = 0;
    for (ll i = 0; i < cnt; i++) 
        ans += d % (x + i);
    ans += (k - cnt) * d;
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