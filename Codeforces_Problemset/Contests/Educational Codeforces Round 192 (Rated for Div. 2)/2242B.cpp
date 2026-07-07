#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    vector<int> P1(n + 1, 0), P2(n + 1, 0);
    for(int i=1;i<=n;i++) {
        int v = arr[i - 1];
        P1[i] = P1[i - 1] + (v == 1 ? 1 : -1);
        P2[i] = P2[i - 1] + (v == 3 ? -1 : 1);
    }
    vector<int> M(n, INT_MIN);
    if(n-1>=1) M[n-1] = P2[n-1];
    for(int i = n-2; i>=1; i--)
        M[i] = max(P2[i], M[i+1]);
    bool ok = false;
    for(int L1 = 1; L1 <= n-2; L1++) {
        if(P1[L1] >= 0 && M[L1+1] >= P2[L1]) {
            ok = true;
            break;
        }
    }   
    cout << (ok ? "YES" : "NO") << endl;
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