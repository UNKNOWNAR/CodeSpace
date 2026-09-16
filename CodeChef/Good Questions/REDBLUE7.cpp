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
    sort(all(arr));
    vector<ll> prefixSum(n,0);
    ll total_sum=0;
    for(int i=0;i<n;i++)
        total_sum+=arr[i];
    ll sum_r = 0,ans= 0;
    for(int i=0;i<n;i++){
        sum_r+=arr[i];
        ans = max(ans,sum_r*(n-i-1)*1LL+(total_sum-sum_r)*(i+1)*1LL);
    }
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