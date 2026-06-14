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
    vector<int> p(n);
    for(auto &x:p)  cin>>x;
    ll x = (1LL<<32)-1;
    for(int i=0;i<n;i++){
        if(p[i]==i)
            continue;
        x = p[i]&x;
    }
    cout<<x<<endl;
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