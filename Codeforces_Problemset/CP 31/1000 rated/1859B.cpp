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
    int min1 = 1e9;
    int min2 = 1e9;
    ll ans = 0;
    while(n--){
        int m;
        cin>>m;
        vector<int> v(m);
        for(auto &it:v)
            cin>>it;
        sort(all(v));
        min1 = min(min1,v[0]);
        min2 = min(min2,v[1]);
        ans += v[1];
    }
    ans -= min2;
    ans += min1;
    cout<<ans<<endl;
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