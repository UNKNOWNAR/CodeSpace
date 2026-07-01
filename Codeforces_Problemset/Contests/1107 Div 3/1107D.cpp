#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    vector<ll> a(n), b(n);
    for (int i=0;i<n;i++) cin>>a[i];
    for (int i=0;i<n;i++) cin>>b[i];
    vector<ll> c_a(n), c_b(n);
    for (int i=0;i<n;i++) {
        ll sign = (i%2==0)?1:-1;
        c_a[i] = sign*a[i];
        c_b[i] = sign*b[i];
    }
    ll P = 0, M = 0, cur = 0;
    bool ok = true;
    for (int i=0;i<n;i++) {
        ll target = c_b[i]-c_a[i];
        ll diff = target - cur;
        bool oneIndexedOdd = ((i+1)%2==1); 
        if (diff > 0) {
            if (oneIndexedOdd) 
                P += diff;
            else {
                M -= diff;
                if (M < 0) 
                    ok = false;
            }
        } else if (diff < 0) {
            ll d = -diff;
            if (!oneIndexedOdd) 
                M += d;
            else {
                P -= d;
                if (P < 0) 
                    ok = false;
            }
        }
        cur = target;
        if(!ok) break;
    } 
    cout<<(ok?"YES":"NO")<<endl;
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