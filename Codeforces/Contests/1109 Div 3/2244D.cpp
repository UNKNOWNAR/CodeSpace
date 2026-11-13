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
int dp[2*(int)(1e5)+5][2];
int tryAll(vi &a,set<int> &b,int i,int parity){
    if(i==-1)
        return 0;
    if(dp[i][parity]!=-1)
        return dp[i][parity];
    int max_sum = tryAll(a,b,i-1,parity)+((parity)?-a[i]:a[i]);
    if(b.contains(i+1))
        max_sum = max(tryAll(a,b,i-1,!parity)-((parity)?-a[i]:a[i]),max_sum);
    return dp[i][parity] = max_sum;
}
void solve(){
    int n,m;
    cin>>n>>m;
    vi a(n);
    for(auto &x:a)
        cin>>x;
    set<int> b;
    while(m--){
        int x;
        cin>>x;
        b.insert(x);
    }
    memset(dp,-1,sizeof(dp));
    cout<<tryAll(a,b,n-1,0);
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