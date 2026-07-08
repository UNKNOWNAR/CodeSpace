#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    vector<int> arr(n);
   vector<ll> bits(32, 0);
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        int msb = 0;
        for (int j = 30; j >= 0; j--) {
            if ((x >> j) & 1) {
                msb = j;
                break;
            }
        }
        bits[msb]++;
    }
    ll ans = 0;
    for (int i = 0; i < 32; i++) 
        ans += (bits[i] * (bits[i] - 1)) / 2;
    cout << ans << endl;
}
int main() {
    fast_io; 
    int t;
    cin >> t; 
    while (t--) 
        solve();
    return 0;
}