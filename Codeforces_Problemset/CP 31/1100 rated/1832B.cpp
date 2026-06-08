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
    vector<ll> a(n),left_sum(n),right_sum(n);
    ll sum = 0;
    for (auto &x : a){ 
        cin >> x;
        sum += x;
    }
    sort(all(a));
    for (int i=n-2;i>=0;i--)
        right_sum[i] = right_sum[i+1]+a[i];
    for(int i=1;i<n;i++)
        left_sum[i] = left_sum[i-1]+a[i];
    ll ans = 0;
    for(int i=0;i<=k;i++)
        ans = max(ans,(sum-right_sum[n-1-(k-i)]-left_sum[2*i]));
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