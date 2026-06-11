#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll a,b,c;
    cin>>a>>b>>c;
    if(a==b)
        cout<<0<<endl;
    else if(gcd(a,c)==gcd(b,c))
        cout<<1<<endl;
    else if(gcd(a,c+1)==gcd(b,c+1))
        cout<<2<<endl;
    else
        cout<<3<<endl;
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