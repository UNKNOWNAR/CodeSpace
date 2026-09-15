#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
const ll mod = 998244353;
void solve() {
    string s;
    cin>>s;
    int n=s.size();
    ll ways = 1,blocks = 1,len = 1;
    for(int i=1;i<n;i++){
        if(s[i-1]==s[i])
            len++;
        else{
            ways = (ways*len)%mod;
            blocks++;
            len=1;
        }
    }
    ways = (ways*len)%mod;
    int k = n-blocks;
    ll factorial = 1;
    for(int i=1;i<=k;i++)
        factorial = (factorial*i)%mod;
    ways = (ways*factorial)%mod;
    cout<<k<< " " << ways << endl;
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