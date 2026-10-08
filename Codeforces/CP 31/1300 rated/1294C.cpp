#include<bits/stdc++.h>
using namespace std;
#define fastIO() ios_base::sync_with_stdio(false);cin.tie(NULL)
#define int long long
#define nl cout<<'\n'
#define sp ' '
#define vi vector<int>
#define vvi vector<vector<int>>
#define pii pair<int,int>
#define pb push_back
#define aint(v) v.begin(),v.end()
#define sz(x) ((int)(x).size())
#define F first
#define S second
#define no cout<<"NO"
#define yes cout<<"YES"
#define inf LLONG_MAX
int mod = 1e9+7;

int power(int base, int exp) {
    int res = 1;
    while(exp > 0) {
        if(exp % 2 == 1) res *= base;
        base *= base;
        exp /= 2;
    }
    return res;
}

vector<pii> primes(int x) {
    vector<pii> res;
    for (int i = 2; i * i <= x; ++i) {
        if (x % i == 0) {
            int cnt = 0;
            while (x % i == 0) {
                cnt++;
                x /= i;
            }
            res.pb({i, cnt});
        }
    }
    if (x > 1) 
        res.pb({x, 1});
    return res;
}

void solve(){
    int n;
    cin>>n;
    vector<pii> factors = primes(n);
    if(factors.size()>=3){
        yes; nl;
        cout<<power(factors[0].F,factors[0].S)<<sp;
        cout<<power(factors[1].F,factors[1].S)<<sp;
        int ans = n/(power(factors[0].F,factors[0].S)*power(factors[1].F,factors[1].S));
        cout<<ans; nl;
    }
    else if(factors.size()==2){
        if(factors[0].S==2 && factors[1].S==2){
            yes; nl;
            cout<<factors[0].F<<sp;
            cout<<factors[1].F<<sp;
            int ans = n/(factors[0].F*factors[1].F);
            cout<<ans; nl;
        }
        else if(factors[0].S>=3 || factors[1].S>=3){
            yes; nl;
            if(factors[0].S>=3){
                cout<<power(factors[1].F,factors[1].S)<<sp;
                cout<<factors[0].F<<sp;
                int ans = n/(power(factors[1].F,factors[1].S)*factors[0].F);
                cout<<ans; nl;
            }
            else{
                cout<<power(factors[0].F,factors[0].S)<<sp;
                cout<<factors[1].F<<sp;
                int ans = n/(power(factors[0].F,factors[0].S)*factors[1].F);
                cout<<ans; nl; 
            }
        }
        else {
            no; nl;
        }
    }
    else {
        if(factors[0].S>=6){
            yes; nl;
            cout<<factors[0].F<<sp;
            cout<<power(factors[0].F,2)<<sp;
            int ans = n/power(factors[0].F,2)/factors[0].F;
            cout<<ans; nl;
        }
        else {
            no; nl;
        }
    }
}

signed main(){
    fastIO();
    int tt=1;
    cin>>tt;
    while(tt--) {
        solve();
    }
    return 0;
}