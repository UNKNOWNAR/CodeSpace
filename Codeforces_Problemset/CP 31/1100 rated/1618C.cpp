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
    vector<ll> arr(n);
    ll gcd_odd = 0,gcd_even=0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        if((i&1)==0)
            gcd_even = gcd(gcd_even,arr[i]);
        else
            gcd_odd = gcd(gcd_odd,arr[i]);
    }
    bool even_valid = true,odd_valid = true;
    for(int i=0;i<n;i++){
        if (i % 2 != 0 && arr[i] % gcd_even == 0) 
            even_valid = false;
        if (i % 2 == 0 && arr[i] % gcd_odd == 0) 
            odd_valid = false;
    }
    if (even_valid) 
        cout << gcd_even << endl;
    else if (odd_valid) 
        cout << gcd_odd << endl;
    else 
        cout << 0 << endl;
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