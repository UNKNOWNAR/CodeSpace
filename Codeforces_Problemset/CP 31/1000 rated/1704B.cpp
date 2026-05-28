#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,x;
    cin>>n>>x;
    int a[n];
    for(int i=0;i<n;i++)    cin>>a[i];
    ll min_val = -1e18,max_val = 1e18;
    int ops = 0;
    for(int i=0;i<n;i++)    {
        min_val = max(min_val, (ll)a[i]-x);
        max_val = min(max_val, (ll)a[i]+x);
        if(min_val > max_val) {
            ops++;
            min_val = a[i]-x;
            max_val = a[i]+x;
        }
    }
    cout<<ops<<endl;
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