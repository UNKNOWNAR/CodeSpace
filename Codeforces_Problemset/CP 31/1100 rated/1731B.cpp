#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
int main() {
    fast_io; 
    int t;
    cin >> t; 
    int mod = 1e9+7;
    while (t--) {
        ll n;
        cin>>n;
        ll ans = ((674 * (n % mod) % mod * ((n + 1) % mod) % mod * ((2 * n + 1) % mod)) % mod - (1011 * (n % mod) % mod * ((n + 1) % mod)) % mod + mod) % mod;
        cout<<ans<<endl;
    }
    return 0;
}