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
    ll sum = 0;
    int neg_count = 0;
    ll minm_abs = 1e9;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        if(arr[i]<0)
            neg_count++;
        minm_abs = min(minm_abs,abs(arr[i]));
        sum += abs(arr[i]);
    }
    if(neg_count%2!=0)
        sum -= 2*minm_abs;
    cout<<sum<<endl;
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