#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    string s;
    cin>>n>>s;
    int ca=0,cb=0;
    for(int i=0;i<n;i++){
        if(s[i]=='a')
            ca++;
        else
            cb++;
    }
    cout<<ca<<" "<<cb<<endl;
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