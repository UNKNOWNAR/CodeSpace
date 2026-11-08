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
    int n,sum=0;
    cin>>n;
    vi nums(n);
    bool all_one = true;
    bool notmid1s = false;
    for(int i=0;i<n;i++){
        cin>>nums[i];
        all_one &= nums[i]==1;
        sum += nums[i];
        if(i>0&&i<n-1&&nums[i]!=1)
            notmid1s = true;
    }
    if(all_one){
        cout<<-1;
        return;
    }
    if(notmid1s)
        cout<<sum-1;
    else
        cout<<sum-n+1;
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