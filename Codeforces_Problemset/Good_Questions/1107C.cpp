#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    string s;
    int n;
    cin>>n>>s;
    int runs = 1;
    for (int i=1;i<n;i++) 
        if(s[i]!=s[i-1]) runs++;
    cout<<(runs==2?2:1)<<endl;
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