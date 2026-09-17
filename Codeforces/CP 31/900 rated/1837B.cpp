#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin >> n;
    string s;
    cin >> s;
    int ans = 1;
    int count = 1;
    int prev = 0;
    for (int i = 1; i < n; i++) {
        if(s[i]==s[i-1])
            count++;
        else{
            ans = max(ans,max(abs(count-prev),count));
            prev = count;
            count = 1;
        }
    }
    ans = max(ans,max(abs(count-prev),count));
    cout << ans+1 << endl;
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