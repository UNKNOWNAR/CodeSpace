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
    string s;
    cin>>s;
    int c0=0,c1=0;
    for(int j=0;j<n;j++){
        if(s[j]=='0')
            c0++;
        else
            c1++;
    }
    if(c0==n||c1==n){
        cout<<0<<endl;
        return;
    }
    if(s[0]=='1'){
        cout<<c0<<endl;
        return;
    }
    int i = 0;
    while(i<n && s[i]!='1')
        i++;
    c0=0,c1=0;
    for(int j=i;j<n;j++){
        if(s[j]=='0')
            c0++;
        else
            c1++;
    }
    int cost = c1,prevC1  = 0;
    while(i<n){
        if(s[i] == '1'){
            cost = min(cost,c0+prevC1);
            prevC1++;
        }
        else
            c0--;
        i++;
    }
    cout<<cost<<endl;
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