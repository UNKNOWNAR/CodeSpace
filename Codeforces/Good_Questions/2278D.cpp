#include<bits/stdc++.h>
using namespace std;
#define fastIO() ios_base::sync_with_stdio(false);cin.tie(NULL)
#define int long long
#define nl cout<<'\n'
#define sp ' '
#define vi vector<int>
#define vvi vector<vector<int>>
#define pii pair<int,int>
#define pb push_back
#define all(v) v.begin(),v.end()
#define sz(x) ((int)(x).size())
#define F first
#define S second
#define no cout<<"NO"
#define yes cout<<"YES"
#define inf LLONG_MAX
int mod = 1e9+7;
void solve(){
    int n;
    cin>>n;
    vi arr(n);
    for(auto &x:arr)
        cin>>x;
    sort(all(arr));
    int target = arr[n/2];
    int ops = *max_element(all(arr))-*min_element(all(arr));
    int cost = 0;
    for(auto x:arr)
        cost += abs(x-target);
    cout<<cost<<" "<<ops;
}

signed main(){
    fastIO();
    int tt=1;
    cin>>tt;
    while(tt--) {
        solve();
        nl;
    }
    return 0;
}