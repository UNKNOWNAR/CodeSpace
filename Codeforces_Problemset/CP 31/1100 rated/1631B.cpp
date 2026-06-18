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
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int ans = 0;
    int i = n - 1;
    while (i >= 0 && arr[i] == arr[n - 1]) {//n
        i--;
    }
    if (i == -1) {
        cout << 0 << endl;
        return;
    }
    while (i >= 0) {//n
        i -= (n - 1 - i);
        ans++;
        while (i >= 0 && arr[i] == arr[n - 1]) {
            i--;
        }
    }
    cout << ans << endl;
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