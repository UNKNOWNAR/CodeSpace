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
    vector<pair<int, int>> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i].first;
        a[i].second = i + 1; 
    }
    sort(all(a), [](pair<int, int>& x, pair<int, int>& y) {
        return x.first > y.first;
    });
    vector<int> ans(n + 1);
    ans[0] = 0;
    int next = 1;
    ll total_dist = 0;
    for (int i = 0; i <n; i++) {
        ll dist = (i / 2) + 1;
        if (i % 2 == 0) 
            ans[a[i].second] = dist;
        else 
            ans[a[i].second] = -dist;
        total_dist += 2LL*dist*a[i].first;
    }
    cout<<total_dist<<endl;
    for(int i=0;i<n+1;i++)    cout<<ans[i]<<" ";
    cout<<endl;
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