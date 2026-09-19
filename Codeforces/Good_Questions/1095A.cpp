#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    string s;
    cin>>s;
    int len = (int)sqrt(2*n);
    string ans = "";
    while(n>0){
        ans += s[n-1];
        n-=len;
        len--;
    }
    reverse(all(ans));
    cout<<ans<<endl;
}
int main() {
    fast_io; 
    int t=1; 
    while (t--) {
        solve();
    }
    return 0;
}