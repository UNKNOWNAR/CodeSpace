#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll x,y,k;
    cin>>x>>y>>k;
    ll numerator = (y + 1) * k - 1;
    ll denominator = x - 1;
    ll ops = (numerator + denominator - 1) / denominator;
    cout<<ops+k<<endl;
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