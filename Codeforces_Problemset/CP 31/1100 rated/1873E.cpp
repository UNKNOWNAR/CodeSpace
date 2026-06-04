#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
bool check(vector<ll> &a,ll mid,ll x){
    ll water = 0;
    for(auto &it:a){
        if(it<mid)
            water += mid-it;
    }
    return water<=x;
}
void solve() {
    ll n,x;
    cin>>n>>x;
    vector<ll> a(n);
    for(int i=0;i<n;i++)    cin>>a[i];
    ll low = 1;
    ll high = ceil(x/n)+*max_element(all(a));
    ll ans = 0;
    while(low<=high){
        ll mid = low+(high-low)/2;
        if(check(a,mid,x)){
            ans = mid;
            low = mid+1;
        }
        else
            high = mid-1;
    }
    cout<<ans<<endl;
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