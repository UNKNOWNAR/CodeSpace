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
    ll ans=0;
    int  k =n/2;
    if(n&1)
        ans = 2*(k+1)*(k+2);
    else 
        ans = (k+1)*(k+1);
    cout<<ans<<endl;
}

int main() {
    fast_io; 
    int t=1;
    while (t--) {
        solve();
    }
    return 0;
}