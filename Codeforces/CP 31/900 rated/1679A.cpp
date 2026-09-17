#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n;
    cin>>n;
    if(n%2==1||n<4){
        cout<<-1<<endl;
        return;
    }
    ll minBus = ceil(n*1.0/6);
    ll maxBus = n/4;
    cout<<minBus<<" "<<maxBus<<endl;
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