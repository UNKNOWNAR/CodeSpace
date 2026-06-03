#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll N,D;
    cin>>N>>D;
    ll P[N];
    for(int i=0;i<N;i++) cin>>P[i];
    sort(P,P+N);
    ll ans=0;
    ll right=N-1;
    ll left=0;
    while(true){
        ll noplayers=(D/P[right])+1;
        if(left+(noplayers-1)>right) break;
        ans++;
        left+=noplayers-1;
        right--;
    }
    cout<<ans<<endl;
}

int main() {
    fast_io; 
    solve();
    return 0;
}