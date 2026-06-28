#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n,m,r,c;
    cin>>n>>m>>r>>c;
    const ll p=998244353;
    const ll pm1=p-1;
    ll E_1=n*m-(n-r+1)*(m-c+1);
    ll power=E_1%pm1;
    ll base=2,exp=power,result=1;
    base%=p;
    while(exp>0){
        if(exp&1) 
            result=result*base%p;
        base=base*base%p;
        exp>>=1;
    }
    cout<<result<<endl;
}
int main() {
    fast_io; 
    int t;
    cin>>t;
    while (t--) {
        solve();
    }
    return 0;
}