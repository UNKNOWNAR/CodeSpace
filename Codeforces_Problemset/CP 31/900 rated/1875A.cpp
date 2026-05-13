#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll a,b,n;
    cin>>a>>b>>n;
    ll arr[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    ll ans = b;
    for(int i=0;i<n;i++)
        ans += min((ll)a-1, arr[i]);
    cout<<ans<<endl;
}
int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}