#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
int dx[4] = {1,1,-1,-1};
int dy[4] = {1,-1,1,-1};
void solve() {
    ll a,b;
    ll Kx,Ky;
    ll Qx,Qy;
    cin>>a>>b>>Kx>>Ky>>Qx>>Qy;
    int ans = 0;
    set<pair<ll,ll>> king_hit,queen_hit;
    for(int i=0;i<4;i++){
        ll tx = Kx + a*dx[i];
        ll ty = Ky + b*dy[i];
        king_hit.insert({tx,ty});
        tx = Kx + b*dx[i];
        ty = Ky + a*dy[i];
        king_hit.insert({tx,ty});
        tx = Qx + a*dx[i];
        ty = Qy + b*dy[i];
        queen_hit.insert({tx,ty});
        tx = Qx + b*dx[i];
        ty = Qy + a*dy[i];
        queen_hit.insert({tx,ty});
    }
    for(auto it:king_hit){
        if(queen_hit.count(it)){
            ans++;
        }
    }
    cout<<ans<<endl;
}

int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}