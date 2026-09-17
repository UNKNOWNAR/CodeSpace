#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n,q;
    cin>>n>>q;
    vector<ll> arr(n),ans(q);
    vector<pair<ll,ll>> Q(q);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    for(int i=0;i<q;i++){
        cin>>Q[i].first;
        Q[i].second=i;
    }
    sort(all(Q));
    ll sum = 0,i=0;
    for(auto &x:Q){
        while(i<n && x.first>=arr[i]){
            sum+=arr[i];
            i++;
        }
        ans[x.second]=sum;
    }
    for(auto &x:ans)
        cout<<x<<' ';
    cout<<endl;
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