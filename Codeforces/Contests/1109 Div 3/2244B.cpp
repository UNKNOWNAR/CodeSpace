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
    vi arr(n);
    int sum = 0;
    for(auto &x:arr){
        cin>>x;
        sum += x;
    }
    for(int i=0;i<n-1;i++){
        if(arr[i]>(i+1)){
            arr[i+1] += arr[i]-(i+1);
            arr[i] = (i+1);
        }
        else if(arr[i]<(i+1)){
            cout<<"no";
            return;
        }
    }
    for(int i=0;i<n-1;i++){
        if(arr[i]>=arr[i+1]){
            cout<<"no";
            return;
        }
    }
    cout<<"Yes";
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