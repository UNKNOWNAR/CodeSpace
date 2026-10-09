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
    int yas = 0;
    for(auto &x:arr){
        cin>>x;
        yas += x;
    }
    int max_1 = arr[0],curr_sum = arr[0];
    for(int i=1;i<n-1;i++){
        curr_sum += arr[i];
        max_1 = max(max_1,curr_sum);
        if(curr_sum<0)
            curr_sum = 0;
    }
    int max_2 = arr[1];
    curr_sum = arr[1];
    for(int i=2;i<n;i++){
        curr_sum += arr[i];
        max_2 = max(max_2,curr_sum);
        if(curr_sum<0)
            curr_sum = 0;
    }
    if(max_1>=yas||max_2>=yas) no; else yes;
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