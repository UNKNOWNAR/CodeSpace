#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k;
    string s;
    cin>>n>>k>>s;
    int cost = 0;
    int ans = k;
    for(int i=0;i<k;i++){
        if(s[i]=='W')
            cost++;
    }
    ans = min(ans,cost);
    for(int i=k;i<n;i++){
        if(s[i]=='W')
            cost++;
        if(s[i-k]=='W')
            cost--;
        ans = min(ans,cost);
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