#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k;
    cin>>n>>k;
    int arr[n];
    for(int i=0;i<n;i++)    cin>>arr[i];
    int ans = arr[0];
    for(int i=0;i<n-1;i++) ans = max(arr[i+1] - arr[i], ans);
    ans = max(ans, 2*(k-arr[n-1]));
    cout<<ans<<endl;
}

int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}