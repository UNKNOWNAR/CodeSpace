#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
ll sum(ll x){
    ll s = x*(x+1);
    s/=2;
    return s;
}
void solve() {
    ll n,k,x;
    cin>>n>>k>>x;
    ll min_sum = sum(k);
    ll max_sum = sum(n)-sum(n-k);
    if(x>=min_sum && x<=max_sum){
        cout<<"YES"<<endl;
    }
    else{
        cout<<"NO"<<endl;
    }
}

int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}