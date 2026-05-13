#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n,k;
    cin>>n>>k;
    if((n-k)%2==0||(n-2*k)%2==0||n%2==0||n%k==0){
        cout<<"YES"<<endl;
        return;
    }
    else{
        cout<<"NO"<<endl;
        return;
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