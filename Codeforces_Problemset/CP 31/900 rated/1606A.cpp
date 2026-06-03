#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    string s;
    cin>>s;
    int n = s.size();
    if(s[0]!=s[n-1]){
        if(s[0]=='a')
            s[0] = 'b';
        else 
            s[0] = 'a';
    }
    cout<<s<<endl;
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