#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    string binary;
    cin>>n>>binary;
    int i=0;
    while((i<n/2)&&((binary[i]=='0'&&binary[n-i-1]=='1')||(binary[i]=='1'&&binary[n-i-1]=='0'))){
        i++;
    }
    
    cout<<n-2*i<<endl;
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