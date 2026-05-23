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
    ll a[n];
    for (int i = 0; i < n; ++i) cin >> a[i];
    vector<int> ops;
    int flips = 0;
    for (int i = n - 1; i >= 0; --i) {
        ll current_val = a[i];
        if (flips % 2 == 1) 
            current_val = -current_val;
        if (current_val > 0) {
            ops.push_back(i + 1);
            flips++;
        }
    }
    cout << ops.size() << endl;
    for (int i = 0; i < ops.size(); ++i) {
        cout << ops[i] << (i == ops.size() - 1 ? "" : " ");
    }
    cout << endl;
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