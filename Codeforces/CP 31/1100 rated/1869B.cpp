#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k,a,b;
    cin>>n>>k>>a>>b;
    vector<vector<ll>> points(n, vector<ll>(2));
    for(int i=0;i<n;i++){
        cin>>points[i][0];
        cin>>points[i][1];
    }
    ll cost = abs(points[a-1][0]-points[b-1][0]) + abs(points[a-1][1]-points[b-1][1]);
    ll cost1 = 1e18;
    for(int i=0;i<k;i++)
        cost1 = min(abs(points[a-1][0]-points[i][0]) + abs(points[a-1][1]-points[i][1]),cost1);
    ll cost2 = 1e18;
    for(int i=0;i<k;i++)
        cost2 = min(abs(points[b-1][0]-points[i][0]) + abs(points[b-1][1]-points[i][1]),cost2);
    cost = min(cost,cost1+cost2);
    cout<<cost<<endl;
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