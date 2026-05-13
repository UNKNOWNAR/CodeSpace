#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,m;
    cin>>n>>m;
    string x,s;
    cin>>x>>s;
    int operations=0;
    if(x.find(s) != string::npos){
        cout<<operations<<endl;
        return;
    }
    while(operations<3||n<=m){
        operations++;
        x = x+x;
        n = x.size(); 
        if(x.find(s) != string::npos){
            cout<<operations<<endl;
            return;
        }
    }
    cout<<-1<<endl;
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