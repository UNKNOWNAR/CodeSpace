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
    map<int,int> freq;
    for(auto &x:arr){
        cin>>x;
        sum += x;
        freq[x]++;
    }
    vi nice_indx;
    for(int i=0;i<n;i++){
        int target = sum-arr[i];
        if(!(target&1)){
            target = target>>1;
            if(target == arr[i] && freq[target]>=2)
                nice_indx.pb(i+1);
            else if(target != arr[i] && freq[target]>=1)
                nice_indx.pb(i+1);
        }            
    }
    cout<<nice_indx.size();
    nl;
    for(auto x:nice_indx)
        cout<<x<<" ";
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