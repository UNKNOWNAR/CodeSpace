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
    vector<int> a(n);
    for(auto &x:a)
        cin>>x;
    int x = 0;
    for(int i=0;i<(n+1)/2;i++){
        int diff = abs(a[i]-a[n-1-i]);
        x = gcd(x,diff);
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