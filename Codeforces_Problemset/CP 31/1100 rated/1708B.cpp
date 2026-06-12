#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    ll l,r;
    cin>>l>>r;
    vector<ll> ans(n);
    for(int i=1;i<=n;i++){
        ll a = ceil(l*1.0/i)*i;
        if(a>r){
            cout<<"NO"<<endl;
            return;
        }
        ans[i-1] = a;
    }
    cout<<"YES"<<endl;
    for(auto &a:ans)
        cout<<a<<" ";
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