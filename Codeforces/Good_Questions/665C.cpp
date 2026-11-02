#include<bits/stdc++.h>
using namespace std;
#define fastIO() ios_base::sync_with_stdio(false);cin.tie(NULL)
#define int long long
#define nl cout<<'\n'
#define sp ' '
#define vi vector<int>
#define vvi vector<vector<int>>
#define pii pair<int,int>
#define pb push_back
#define all(v) v.begin(),v.end()
#define sz(x) ((int)(x).size())
#define F first
#define S second
#define no cout<<"NO"
#define yes cout<<"YES"
#define inf LLONG_MAX
int mod = 1e9+7;

void solve() {
    string s;
    cin >> s;
    int n = s.size();

    for (int i = 0; i < n - 1; i++) {
        if (s[i] == s[i + 1]) {
            for (char c : {'a', 'b', 'c'}) {
                if (c != s[i] && (i + 2 >= n || c != s[i + 2])) {
                    s[i + 1] = c;
                    break;
                }
            }
        }
    }
    cout << s;
}

signed main(){
    fastIO();
    int tt=1;
    while(tt--) {
        solve();
        nl;
    }
    return 0;
}