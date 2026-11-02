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
    vi nums(n);
    for(auto &x:nums)
        cin>>x;
    double sum = 0;
    vi prefixSum(n);
    prefixSum[0] = nums[0];
    for(int i=1;i<n;i++)
        prefixSum[i] = prefixSum[i-1]+nums[i];
    for(int i=0;i<n-k+1;i++)
        sum += prefixSum[i+k-1]-(i > 0? prefixSum[i-1]:0);
    double ans = sum/(n-k+1);
    cout<<fixed<<setprecision(10)<<ans;
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