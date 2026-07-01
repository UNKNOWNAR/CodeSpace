#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
ll rec(int n,int k){
    if(k>=n)
        return n;
    return k + rec((n-k)/2,k);
}
void solve() {
    int n,k;
    cin>>n>>k;  
    cout<<rec(n,k)<<endl;
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