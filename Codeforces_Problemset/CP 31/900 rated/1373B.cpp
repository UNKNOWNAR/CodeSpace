#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    string bin;
    cin>>bin;
    int c0=0,c1=0;//Number of 01 and 10 pattern comes from minm value of c0 and c1
    for(char it:bin)
    {
        if(it=='0')c0++;
        else c1++;
    }
    int op=min(c0,c1);
    if(op%2==0)
        cout<<"NET"<<endl;
    else
        cout<<"DA"<<endl;
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