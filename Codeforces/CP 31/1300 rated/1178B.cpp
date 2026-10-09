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
int n;
int dp[1000005][3][2];
int solve(string &s,int i,int w,int o){
    if(o<0||w<0)
        return 0;
    if((!w)&&(!o))
        return 1;
    if(i==n)    return 0;
    if(dp[i][w][o]!=-1)
        return dp[i][w][o];
    int count = 0;
    if(w==2||(w==1&&o==0)){
        if(i<=n-2&&(s[i]=='v'&&s[i+1]=='v'))
            count += solve(s,i+2,w-1,o);//take
        count += solve(s,i+1,w,o);//skip
    }
    if(w==1&&o==1){
        if(s[i]=='o')
            count += solve(s,i+1,w,o-1);//take
        count += solve(s,i+1,w,o);//skip
    }
    return dp[i][w][o] = count;
}
void soln(){
    string s;
    cin>>s;
    n = sz(s);
    memset(dp,-1,sizeof(dp));
    cout<<solve(s,0,2,1);
}

signed main(){
    fastIO();
    int tt=1;
    while(tt--) {
        soln();
        nl;
    }
    return 0;
}