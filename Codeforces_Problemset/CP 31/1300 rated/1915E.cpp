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
    set<ll> uniq;
    ll sum = 0;
    bool found = false;
    uniq.insert(0);
    for(int i=0;i<n;i++){
        ll temp;
        cin>>temp;
        if(i&1)
            sum+=temp;
        else
            sum -= temp;
        if(uniq.contains(sum))
            found = true;
        uniq.insert(sum);
    }
    if(found)
        cout<<"YES"<<endl;
    else
        cout<<"NO"<<endl;
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