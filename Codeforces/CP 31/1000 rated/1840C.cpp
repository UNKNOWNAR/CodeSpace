#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k,q;
    cin>>n>>k>>q;
    vector<int> v(n);
    for(int i=0;i<n;i++) cin>>v[i];
    int start = 0,end = 0;
    ll ways = 0;
    for(int i=0;i<n;i++){
        if(v[i]<=q)
            end++;
        else{
            int len = end-start;
            if(len>=k) ways += 1LL*(len-k+1)*(len-k+2)/2;
            end++;
            start = end;
        }
    }
    int len = end-start;
    if(len>=k) ways += 1LL*(len-k+1)*(len-k+2)/2;
    cout<<ways<<endl;
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