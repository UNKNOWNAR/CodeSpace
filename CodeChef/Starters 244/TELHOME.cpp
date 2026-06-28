#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int t,d;
    cin>>d>>t;
    if(t>d)
        cout<<0<<endl;
    else
        cout<<d-t<<endl;
}

int main() {
    fast_io; 
    int t=1;
    while (t--) {
        solve();
    }
    return 0;
}