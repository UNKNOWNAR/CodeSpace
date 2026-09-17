#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
vector<bool> precomputed_vals;
void precomputed(){
    precomputed_vals.resize(1e6+1);
    for(ll k=2;k<=1e3;k++){
        ll sum = 1+k+k*k;
        ll term = k*k*k;
        for(ll a=3;a<=60;a++){
            if(sum<=1e6)
                precomputed_vals[sum] = true;
            else
                break;
            sum+=term;
            term*=k;
        }
    }
}
void solve() {
    ll n;
    cin>>n;
    if(precomputed_vals[n]){
        cout<<"YES"<<endl;
        return;
    }
    cout<<"NO"<<endl;
}

int main() {
    fast_io; 
    precomputed();
    int t;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}