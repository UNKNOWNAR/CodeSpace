#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,x;
    cin>>n>>x;
    ll min = 0;
    ll max = 0;
    ll rem = 0;
    while(n--){
        int a;
        cin>>a;
        min+=a/x;
        rem+=a%x;
        max+=ceil(a*1.0/x);
    }
    min+=ceil(rem*1.0/x);
    cout<<min<<" "<<max<<endl;
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