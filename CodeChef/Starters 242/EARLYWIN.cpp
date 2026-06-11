#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,m;
    cin>>n>>m;
    string a,b,common;
    cin>>a>>b;
    for(int i=0;i<min(m,n);i++){
        if(a[i]!=b[i])
            break;
        common += a[i];
    }
    cout<<common<<endl;
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