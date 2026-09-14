#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int L,R;
    cin>>L>>R;
    for(int i=L;i<=R;i++){
        if(i%2==0){
            cout<<"YES"<<endl;
            return;
        }   
    }
    cout<<"NO"<<endl;
}

int main() {
    fast_io; 
    int t = 1;
    while (t--) {
        solve();
    }
    return 0;
}