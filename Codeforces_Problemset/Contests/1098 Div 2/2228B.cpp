#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n,x1,x2,k;
    cin>>n>>x1>>x2>>k;
    ll dist = x1-x2;
    ll m = min(dist,n-dist);
    if (n%2==0&&m==n/2)
        cout<<m+k<<endl;
    else
        cout<<min(m+k,n/2)<<endl;
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