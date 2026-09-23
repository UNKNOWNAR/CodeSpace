#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,m;
    cin>>n>>m;
    vector<int> k(n),c(m);
    for(int i=0;i<n;i++)
        cin>>k[i];
    for(int i=0;i<m;i++)
        cin>>c[i];
    sort(all(k));
    ll sum = 0;
    int ptr = 0;
    for(int i=n-1;i>=0;i--){
        if(ptr<m&&c[k[i]-1]>=c[ptr])
            sum += c[ptr++];
        else
            sum += c[k[i]-1];
    }
    cout<<sum<<endl;
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