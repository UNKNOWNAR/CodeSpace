#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k;
    cin>>n>>k;
    vector<int> v(n);
    ll count = 0;
    for(int i=0;i<n;i++){
        cin>>v[i];
        v[i] = (v[i]%k==0)?k:v[i]%k;
    }

    vector<pair<int,int>> vp;
    for(int i=0;i<n;i++)
        vp.pb({v[i],i+1});
    
    sort(all(vp),[](pair<int,int> a, pair<int,int> b){
        if(a.first==b.first) return a.second<b.second;
        return a.first>b.first;
    });
    for(auto &it:vp)
        cout<<it.second<<" ";
    cout<<endl;
}

int main() {
    fast_io; 
    int t;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}