#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n, k;
    cin >> n >> k;
    int current_prefix = 0;
    int min_prefix = 0; 
    int max_prefix = 0; 
    for (int i = 0; i < n; i++) {
        int a;
        cin >> a;
        current_prefix += a;
        min_prefix = min(min_prefix, current_prefix);
        max_prefix = max(max_prefix, current_prefix);
    }
    if (max_prefix - min_prefix <= k) 
        cout << "Yes\n";
    else 
        cout << "No\n";
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