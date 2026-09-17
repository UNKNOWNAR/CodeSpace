#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
bool check(vector<ll> &s, ll mid, ll c){
    __int128 area = 0;
    for(auto &it:s){
        __int128 side = it+2LL*mid;
        area += side * side;
        if(area>c)
            return false;
    }
    return true;
}
void solve() {
    ll n,c;
    cin>>n>>c;
    vector<ll> s(n);
    for(int i=0;i<n;i++)    cin>>s[i];
    ll low = 1;
    ll high = 1e9;   
    ll ans = 0;
    while(low<=high){
        ll mid = low + (high-low)/2;
        if(check(s,mid,c))
            low = mid+1;
        else
            high = mid-1;
    }
    cout<<high<<endl;
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