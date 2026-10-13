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
    int n,k;
    cin>>n>>k;
    map<int,int> cnt;
    for(int i=0;i<n;i++){
        int x;
        cin>>x;
        cnt[x]++;
    }
    for(int x=0;x<=2*1e5;x++){
        if((!cnt[x])||(cnt[x]<2*k-1)){
            no;
            return;
        }
        else if(cnt[x]==2*k-1){
            yes;
            return;
        }
    }
    no;
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