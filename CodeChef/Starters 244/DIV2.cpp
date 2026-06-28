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
    vector<ll> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    map<ll, pair<ll, int>> reach;
    for(ll x : arr) {
        ll shifts = 0;
        ll temp = x;
        while(true) {
            reach[temp].first += shifts;
            reach[temp].second++;
            if(temp == 0) break;
            temp >>= 1;
            shifts++;
        }
    }
    ll min_ops = -1;
    for(auto const& [val, data] : reach) {
        if(data.second == n) {
            if(min_ops == -1 || data.first < min_ops) {
                min_ops = data.first;
            }
        }
    }
    cout << min_ops << endl;
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