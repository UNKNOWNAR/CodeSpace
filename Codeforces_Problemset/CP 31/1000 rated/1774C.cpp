#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    char c;
    string s;
    cin>>n>>c>>s;
    if(c=='g'){
        cout<<0<<endl;
        return;
    }
    string mod = s+s;
    int ans = 0;
    int cur = 0;
    bool flag = false;
    for(int i=0;i<2*n;i++){
        if(flag)
            cur++;
        if(mod[i]==c)
            flag = true;
        else if(mod[i]=='g'){
            ans = max(ans,cur);
            cur = 0;
            flag = false;
        }
    }
    cout<<ans<<endl;
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