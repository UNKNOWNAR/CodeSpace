#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll x0,t;
    cin>>x0>>t;
    ll rem = t%4;
    ll displacement;
    switch (rem)
    {
        case 0:
            displacement = 0;
            break;
        case 1:
            displacement = -t;
            break;
        case 2:
            displacement = +1;
            break;
        case 3:
            displacement = t+1;
            break;
    }
    if(abs(x0)%2==1)
        cout<<x0-displacement<<endl;
    else
        cout<<x0+displacement<<endl;
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