#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define endl '\n'
void solve() {
    int n,k;
    cin>>n>>k;
    if(k==n-1)
        cout<<"Yes"<<endl;
    else
        cout<<"No"<<endl;

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