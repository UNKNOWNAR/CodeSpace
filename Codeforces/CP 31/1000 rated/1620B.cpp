#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll w,h;
    cin>>w>>h;
    ll area_maxm = 0;
    for(int i=0;i<4;i++){
        int n;
        cin>>n;
        int side[n];
        for(int j=0;j<n;j++)
            cin>>side[j];
        ll area = 1LL*(side[n-1]-side[0])*((i<2)?h:w);
        area_maxm = max(area_maxm,area);
    }
    cout<<area_maxm<<endl;

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