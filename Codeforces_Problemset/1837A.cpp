#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int x;
    int k;
    cin >> x >> k;
    if(x%k!=0){
        cout<<1<<endl;
        cout<<x<<endl;
    }
    else{
        cout<<2<<endl;
        cout<<1<<' '<<x-1<<endl;
    }
}

int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}