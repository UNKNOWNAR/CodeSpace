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
void soln(){
    int n;
    cin >> n;
    vi a(n);
    for(auto &x : a) cin >> x;
    int maxS = 0, minS = 0;
    int ans = -inf;
    for(int i = 0; i < n; i++){
        int best = a[i] + max({maxS, -minS, (int)0});
        ans = max(ans, best);
        int nMax = max({2*maxS+a[i], 2*minS+a[i], a[i], maxS+a[i], minS+a[i]});
        int nMin = min({2*maxS+a[i], 2*minS+a[i], a[i], maxS+a[i], minS+a[i]});
        maxS = nMax;
        minS = nMin;
    }
    cout << ans;
}

signed main(){
    fastIO();
    int tt=1;
    cin>>tt;
    while(tt--) {
        soln();
        nl;
    }
    return 0;
}