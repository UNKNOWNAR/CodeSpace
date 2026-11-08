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
    for(int i=0;i<n;i++){
        cin>>arr[i];
        arr[i] -= i;
    }
    sort(all(arr));
    arr.erase(unique(all(arr)), arr.end());
    int mx = 1, cur = 1;
    for (size_t i = 1; i < arr.size(); i++) {
        if (arr[i] == arr[i - 1] + 1) 
            cur++;
        else 
            cur = 1;
        mx = max(mx, cur);
    }
    cout << mx << endl;
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