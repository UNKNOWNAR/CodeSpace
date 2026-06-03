#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    /*gcd(a,b) = gcd(a-b,b) given a>b and gcd(a-b,b)<=min(a-b,b) 
        so for maxm gcd we have gcd(a,b) = a-b now we need to  make b = k*(a-b) for some integer k so we need to minimize |b-k*(a-b)| 
        which is equivalent to min((b%diff), diff-(b%diff))*/
    ll a,b;
    cin>>a>>b;
    if(a==b){
        cout<<0<<" "<<0<<endl;
        return;
    }
    ll small = min(a,b);
    ll diff = abs(a-b);
    cout<<diff<<" "<<min(small%diff, diff-small%diff)<<endl;
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