#include<bits/stdc++.h>
using namespace std;
#define fastIO() ios_base::sync_with_stdio(false);cin.tie(NULL)
#define int long long
#define nl cout<<'\n'
#define sp ' '
#define vi vector<int>
#define vvi vector<vector<int>>
#define pii pair<int,int>
#define pb push_back
#define all(v) v.begin(),v.end()
#define sz(x) ((int)(x).size())
#define F first
#define S second
#define no cout<<"NO"
#define yes cout<<"YES"
#define inf LLONG_MAX
int mod = 1e9+7;

void solve(){
    int n;
    cin >> n;
    int m = 0;
    while ((1LL << m) <= n) 
        m++;
    int x = (1LL << m);
    vector<int> a;
    for (int i = 1; i < x; i++) {
        a.push_back(0);
        a.push_back(i & -i);
    }
    a.push_back(0);
    cout << a.size() << "\n";
    for (int i = 0; i < a.size(); i++) {
        cout << a[i] << (i + 1 == a.size() ? "" : " ");
    }
}

signed main(){
    fastIO();
    int tt=1;
    cin>>tt;
    while(tt--) {
        solve();
        nl;
    }
    return 0;
}