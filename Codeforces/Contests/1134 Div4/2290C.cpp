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
    map<int,int> freq;
    for(int i=0;i<n;i++){
        int x;
        cin>>x;
        freq[x]++;
    }
    vi back;
    int count = freq.size();
    for(auto [x,f]:freq){
        if(f>=2)
            count++;
    }
    cout<<count;
    nl;
    for(auto [x,f]:freq){
        cout<<x<<" ";
        if(f>=2){
            back.push_back(x);
            f-=2;
            while(f--)
                cout<<x<<" ";
        }
    }
    if(!sz(back))
        return;
    for(int i=sz(back)-1;i>=0;i--)
        cout<<back[i]<<" ";
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