#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    string s;
    int c0=0,c1=0;
    cin>>s;
    for(auto it:s){
        if(it=='0')c0++;
        else c1++;
    }
    int len = 0;
    for(auto it:s){
        if(it=='0'&&c1>0){
            c1--;
            len++;
        }
        else if(it=='1'&&c0>0){
            c0--;
            len++;
        }
        else
            break;
    }
    cout<<s.size()-len<<endl;
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

