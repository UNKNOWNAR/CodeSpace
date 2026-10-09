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
    vi a(n),b(n),c(n);
    map<int,int> mp;
    for(int i=0;i<n;i++){
        cin>>a[i];
        mp[a[i]] = i;
    }
    for(int i=0;i<n;i++){
        cin>>b[i];
        c[mp[b[i]]] = i;
    }
    int mx = c[0],count = 0;
    for(int i=1;i<n;i++){
        if(c[i]<mx) count++;
        mx = max(mx,c[i]);
    }
    cout<<count;
}

signed main(){
    fastIO();
    int tt=1;
    while(tt--) {
        solve();
        nl;
    }
    return 0;
}