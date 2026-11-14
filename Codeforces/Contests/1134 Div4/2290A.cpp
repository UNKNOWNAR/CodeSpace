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
    int a,b,c;
    cin>>a>>b>>c;
    int max_val = max({a,b,c});
    int min_val = min({a,b,c});
    int middle_val = a+b+c-max_val-min_val;
    if(max_val-min_val==2&&max_val-middle_val==1)
        cout<<"yes";
    else
        cout<<"no";
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