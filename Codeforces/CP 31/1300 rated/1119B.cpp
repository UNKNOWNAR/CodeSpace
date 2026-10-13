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
    int n,h;
    cin>>n>>h;
    vi arr(n);
    for(auto &x:arr)
        cin>>x;
    int low = 0,high = n-1;
    int ans = 0;
    while(low<=high){
        int mid = (low+high)>>1;
        vi v;
        for(int i=0;i<=mid;i++)
            v.pb(arr[i]);
        sort(all(v));
        int height = 0;
        int p = mid;
        while(p>=0){
            height += v[p];
            if(height>h)
                break;
            p-=2;
        }
        if(height<=h){
            ans = mid+1;
            low = mid+1;
        }
        else
            high = mid-1;
    }
    cout<<ans;
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