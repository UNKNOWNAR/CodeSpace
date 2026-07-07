#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n,k,x;
    cin>>n>>k>>x;
    vector<ll> a(n);
    for(int i=0;i<n;i++)
        cin>>a[i];
    sort(all(a));
    vector<ll> gaps;
    for(int i = 0; i < n - 1; i++) {
        if(a[i+1] - a[i] > x) {
            // Calculate how many students are needed to bridge this gap
            gaps.push_back((a[i+1] - a[i] - 1) / x);
        }
    }
    sort(all(gaps));
    int groups = gaps.size() + 1;
    for(ll cost : gaps){
        if(k >= cost){
            k -= cost;
            groups--;
        }
        else 
            break;
    }
    cout<<groups<<endl;
}

int main() {
    fast_io; 
    int t=1; 
    while (t--) {
        solve();
    }
    return 0;
}