#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int m,n;
    cin>>m>>n;
    if(m>n)
        cout<<m-n<<endl;
    else if(m==n)
        cout<<0<<endl;
    else{
        if((n-m)%2==0)
            cout<<0<<endl;
        else
            cout<<1<<endl;
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