#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve(const vector<ll>& round_num) {
    int n;
    cin >> n;
    int idx = upper_bound(all(round_num),n) - round_num.begin();
    cout << idx << endl;
}
bool check(ll num){
    int n_zero = 0;
    int n_digits = 0;
    ll temp = num;
    while(temp > 0){
        n_digits++;
        if(temp % 10 == 0) n_zero++;
        temp /= 10;
    }
    return n_zero == n_digits-1;
}
int main() {
    vector<ll> round_num;
    for(ll i=1;i<=999999;i++){
        if(check(i))
            round_num.pb(i);
    }
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve(round_num);
    }
    return 0;
}