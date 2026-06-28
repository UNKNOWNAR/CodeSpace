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
    if(k>=n){
        cout<<n<<endl;
        return;
    }
    int p = 0;
    while(p<20&&k*((1LL<<(p+1))-1LL)<=n) p++;
    ll remaining = n - k * ((1LL<<p)-1LL);
    cout << k * p + (remaining >> p) << endl;
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