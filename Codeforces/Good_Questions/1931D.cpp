#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,x,y;
    cin>>n>>x>>y;
    vector<ll> arr(n);
    map<pair<ll,ll>,ll> rem;
    for(int i=0;i<n;i++)
        cin>>arr[i];
    ll count = 0;
    for(int j=0;j<n;j++){
        ll rem_x = (x-arr[j]%x)%x;
        ll rem_y = arr[j]%y;
        count+=rem[{rem_x,rem_y}];
        rem[{arr[j]%x,arr[j]%y}]++;
    }
    cout<<count<<endl;
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