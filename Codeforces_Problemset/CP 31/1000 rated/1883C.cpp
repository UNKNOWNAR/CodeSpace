#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k;
    cin>>n>>k;
    int ans = k;
    int even = 0;
    for(int i=0;i<n;i++){
        int x;
        cin>>x;
        if(x%2==0) even++;
        ans = min(ans,(k-x%k)%k);
    }
    if(k!=4||ans==0)
        cout<<ans<<endl;
    else if(even>=2)
        cout<<0<<endl;
    else if(even==1)
        cout<<1<<endl;
    else if(ans==3)
        cout<<2<<endl;
    else 
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