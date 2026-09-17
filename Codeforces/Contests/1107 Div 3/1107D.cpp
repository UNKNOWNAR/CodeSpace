#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    vector<ll> a(n), b(n);
    ll sumA= 0,sumB= 0;
    for (int i=0;i<n;i++) cin>>a[i];
    for (int i=0;i<n;i++) cin>>b[i];
    for(int i=0;i<n;i++){
        sumA+=a[i];
        sumB+=b[i];
    }
    if(sumA>sumB){
        cout<<"NO"<<endl;
        return;
    }
    ll diff = 0;
    for(int i=0;i<n;i++){
        diff += b[i]-a[i];
        if(diff<0){
            cout<<"NO"<<endl;
            return;
        }
    }
    cout<<"YES"<<endl;
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