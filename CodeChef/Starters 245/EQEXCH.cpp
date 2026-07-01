#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n, k;
    cin >> n >> k;
    vector<int> arr(n),prefix(n,0);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    prefix[0] = arr[0];
    for(int i=1;i<n;i++)
        prefix[i] = prefix[i-1]+arr[i];
    int L = 0,R = k;
    for(auto &p:prefix){
        L = max(L,-p);
        R = min(R,k-p);
        if(L>R){
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