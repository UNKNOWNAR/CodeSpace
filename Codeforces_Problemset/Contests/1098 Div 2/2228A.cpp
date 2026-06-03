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
    int c0 = 0, c1 = 0, c2 = 0;
    for(int i=0;i<n;i++){
        int temp = 0;
        cin>>temp;
        if(temp==0) c0++;
        else if(temp==1) c1++;
        else c2++;
    }
    int ans = c0;
    int temp = min(c1,c2);
    ans += temp;
    c1-=temp;
    c2-=temp;
    ans += c1/3;
    ans += c2/3;
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