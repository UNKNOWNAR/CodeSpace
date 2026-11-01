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
#define all(v) v.rbegin(),v.rend()
#define sz(x) ((int)(x).size())
#define F first
#define S second
#define no cout<<"NO"
#define yes cout<<"YES"
#define inf LLONG_MAX
int mod = 1e9+7;
bool check(int k,int h,vi arr){
    int i = 0;
    for(int i=0;i<k;i+=2){
        h -= arr[i];
        if(h<0)
            return false;
    }
    return true;
}
void solve(){
    int n,h;
    cin>>n>>h;
    vi arr(n);
    for(auto &x:arr)
        cin>>x;
    int low = 1,high = n;
    while(low<=high){
        int k = low + (high-low)/2;
        vi temp(arr.begin(),arr.begin()+k);
        sort(all(temp));
        if(check(k,h,temp))
            low = k+1;
        else 
            high = k-1;
    }
    cout<<high;
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