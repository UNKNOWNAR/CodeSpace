#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n;
    cin >> n;
    vector<ll> v(n);
    for (ll i = 0; i < n; i++) 
        cin >> v[i];
    ll answer = v[n - 1] - v[0];

    for (int i = 1; i < n; i++) 
        answer = max(answer, v[i] - v[0]);
    for (int i = 0; i < n - 1; i++) 
        answer = max(answer, v[n - 1] - v[i]);
    for (int i = 0; i < n - 1; i++) 
        answer = max(answer, v[i] - v[i + 1]);

    cout << answer << endl;
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