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
    for(int i=1;i<=n;i++) cout<<i<<" ";
    for(int i=1;i<=n;i++) cout<<i<<" ";
    cout<<n<<" ";
    for(int i=1;i<=n-1;i++) cout<<i<<" ";
    for(int i=1;i<=n;i++) cout<<i<<" ";
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