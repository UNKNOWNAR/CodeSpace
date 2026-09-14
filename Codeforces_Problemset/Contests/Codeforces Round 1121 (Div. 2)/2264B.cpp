#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,m;
    cin>>n>>m;
    vector<ll> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    priority_queue<ll> mx;
    ll sum = 0;
    for(int i=0;i<m-1;i++){
        sum += arr[i];
        mx.push(arr[i]);
    }
    ll ans = -2e18;
    for(int i=m-1;i<n;i++){
        ans = max(ans,1LL*m*arr[i]-sum);
        if(!mx.empty()&&arr[i]<mx.top()){
            sum -= mx.top();
            mx.pop();
            sum += arr[i];
            mx.push(arr[i]);
        }
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