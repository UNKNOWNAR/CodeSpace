#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    string a, b;
    cin >> a >> b;
    int max_len = 0;
    for (int i = 0; i < a.size(); i++) {
        for (int j = 0; j < b.size(); j++) {
            int current_len = 0;
            while (i + current_len < a.size() && j + current_len < b.size() && a[i + current_len] == b[j + current_len]) 
                current_len++;            
            max_len = max(max_len, current_len);
        }
    }
    cout << a.size() + b.size() - 2 * max_len << endl;
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