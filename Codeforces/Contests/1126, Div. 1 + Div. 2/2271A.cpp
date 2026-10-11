#include <bits/stdc++.h>
using namespace std;
#define fastIO() ios_base::sync_with_stdio(false);cin.tie(NULL)
#define int long long
#define nl cout<<'\n'
#define pii pair<int,int>
void solve() {
    int a, b;
    cin >> a >> b;
    if (b > a+1) 
        cout << -1;
    else if (a % 2 == b % 2) 
        cout << a;
    else 
        cout << a + 1;
}
signed main() {
    fastIO();
    int tt = 1;
    cin >> tt;
    while (tt--) {
        solve();
        nl;
    }
    return 0;
}