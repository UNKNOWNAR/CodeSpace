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
    if(n%3!=2)
        cout<<n%3<<endl;
    else{
        if((n+(n%5==0?5:n%5))%3==0)
            cout<<1<<endl;
        else
            cout<<2<<endl;
    }
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