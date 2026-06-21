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
    vector<int> v(n);
    for (int i = 0; i < n; i++)
        cin >> v[i];
    
    vector<int> last_idx(k + 1, 0);
    vector<int> max_dist(k + 1, 0);
    vector<int> sec_dist(k + 1, 0);
    
    auto update = [](int d, int &mx, int &sc) {
        if (d >= mx) {
            sc = mx;
            mx = d;
        } else if (d > sc) {
            sc = d;
        }
    };
    
    for (int i = 0; i < n; i++) {
        int c = v[i];
        int d = (i + 1) - last_idx[c] - 1;
        update(d, max_dist[c], sec_dist[c]);
        last_idx[c] = i + 1;
    }
    
    int ans = 1e9;
    for (int c = 1; c <= k; c++) {
        int d = (n + 1) - last_idx[c] - 1;
        update(d, max_dist[c], sec_dist[c]);
        int new_max = max(sec_dist[c], max_dist[c] / 2);
        ans = min(ans, new_max);
    }
    
    cout << ans << endl;
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