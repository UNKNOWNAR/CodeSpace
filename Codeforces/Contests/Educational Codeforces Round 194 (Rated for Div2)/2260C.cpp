#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll x, y;
    cin >> x >> y;
    ll s = x + y;
    ll a = 0;
    for (int i = 31; i >= 0; i--){
        if(s&(1<<i)){
            if(a+(1<<i)<=x)
                a+=(1<<i);
        }
    }
    cout<<s<<" "<<x-a<<endl;
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