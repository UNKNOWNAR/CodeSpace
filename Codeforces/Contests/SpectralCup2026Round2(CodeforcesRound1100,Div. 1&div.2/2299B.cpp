#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'

void solve() {
    int n;
    cin >> n;
    vector<ll> a(n), b(n);
    for (int i = 0; i < n; ++i) cin >> a[i];
    for (int i = 0; i < n; ++i) cin >> b[i];
    ll sum = 0;
    ll max_val = 0;
    for(int i = 0; i < n; ++i){
        sum += max(a[i],b[i]);
        max_val = max(min(a[i],b[i]),max_val);
    }
    cout <<max_val+sum << endl;
}
int main() {
    fast_io; 
    int t;
    if (cin >> t) {
        while (t--) {
            solve();
        }
    }
    return 0;
}