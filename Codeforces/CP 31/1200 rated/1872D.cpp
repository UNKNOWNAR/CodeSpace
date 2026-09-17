#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,x,y;
    cin>>n>>x>>y;
    ll g = gcd(x, y);
    ll lcm_val;
    if (x / g > n / y) 
        lcm_val = n + 1; 
    else 
        lcm_val = (x / g) * y;
    ll p = (n / x) - (n / lcm_val);
    ll q = (n / y) - (n / lcm_val);
    ll sum_gain = p * n - (p * (p - 1)) / 2;
    ll sum_loss = (q * (q + 1)) / 2;
    cout<<sum_gain-sum_loss<<endl;
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