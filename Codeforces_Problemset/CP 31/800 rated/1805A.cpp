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
    vector<int> a(n);
    for(int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int xo = 0;
    for(int i = 0; i < n; i++) {
        xo ^= a[i];
    }
    if(n%2!=0)
        cout<<xo<<endl;
    else if(xo==0){
        cout<<a[n-1]<<endl;
    }
    else{
        cout<<-1<<endl;
    }
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