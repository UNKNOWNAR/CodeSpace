#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    int r;
    int b;
    cin>>n>>r>>b;
    int grp_r = r/(b+1);
    int extra_r = r%(b+1);
    for(int i=0;i<b+1;i++){
        for(int j=0;j<grp_r;j++)
            cout<<"R";
        if(extra_r>0){
            cout<<'R';
            extra_r--;
        }
        if(i!=b)
            cout<<'B';
    } 
    cout<<endl;
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