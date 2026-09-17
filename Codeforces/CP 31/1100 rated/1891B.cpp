#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,q;
    cin>>n>>q;
    ll a[n],x[q];
    for(int i=0;i<n;i++)    cin>>a[i];
    for(int i=0;i<q;i++)    cin>>x[i];
    int l = 31;
    for(int i=0;i<q;i++){
        if(l<=x[i])
            continue;
        for(int j=0;j<n;j++){
            if(a[j] % (1LL << x[i]) == 0)
                a[j] += 1LL << (x[i]-1);
        }
        l = x[i];
    }
    for(int j=0;j<n;j++)
        cout<<a[j]<<" ";
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
};