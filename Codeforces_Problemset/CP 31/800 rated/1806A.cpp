#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int a,b,c,d;
    cin >> a>>b>>c>>d;
    c = c-a;
    d = d-b;
    if(d<0){
        cout<<-1<<endl;
        return;
    }
    if(d==0){
        if(c<=0) cout<<-c<<endl;
        else cout<<-1<<endl;
        return;
    }
    if(d==c){
        cout<<d<<endl;
        return;
    }
    if(d>c){
        cout<<d-c+d<<endl;
        return;
    }
    else
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