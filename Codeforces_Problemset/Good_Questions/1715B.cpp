#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n,k,b,s;
    cin>>n>>k>>b>>s;
    ll min_s = b*k;
    ll max_s = b*k+(n)*(k-1);
    if(s<min_s || s>max_s){
        cout<<-1<<endl;
        return;
    }
    vector<ll> a(n,0);
    a[0] = min_s;
    ll rem = s-min_s;
    for(int i=0;i<n;i++){
        ll add = min(rem,k-1);
        a[i]+=add;
        rem-=add;
        if(rem<=0) break;
    }
    for(int i=0;i<n;i++){
        cout<<a[i]<<' ';
    }
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
}