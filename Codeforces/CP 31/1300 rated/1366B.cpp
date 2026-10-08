#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,x,m;
    cin>>n>>x>>m;
    ll l=x,r=x;
    for(int i=0;i<m;i++){
        ll a,b;
        cin>>a>>b;
        if(a<=r&&b>=l){
            l = min(a,l);
            r = max(b,r);
        }
    }
    cout<<r-l+1<<endl;
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