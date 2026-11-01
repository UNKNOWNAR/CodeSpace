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
int grp_0 = 0,grp_1 = 0;
void dfs(int node,int color,vvi &adj,vi &grps){
    grps[node] = color;
    if(color)
        grp_1++;
    else
        grp_0++;
    for(int neighbor:adj[node]){
        if(grps[neighbor]==-1)
            dfs(neighbor,!color,adj,grps);
    }
}
void solve(){
    int n;
    cin>>n;
    vvi adj(n+1);
    vi grps(n+1,-1);
    for(int i=0;i<n-1;i++){
        int u,v;
        cin>>u>>v;
        adj[v].pb(u);
        adj[u].pb(v);
    }
    dfs(1,0,adj,grps);
    cout<<grp_0*grp_1-n+1;
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