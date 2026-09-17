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
    int c3=0,c2=0;
    while(n%3==0)
    {
        n/=3;
        c3++;
    }
    while(n%2==0)
    {
        n/=2;
        c2++;
    }
    if(n==1&&c3>=c2)
        cout<<2*c3-c2<<endl;
    else
        cout<<-1<<endl;
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