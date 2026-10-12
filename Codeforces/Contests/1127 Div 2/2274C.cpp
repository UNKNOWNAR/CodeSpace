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
vi capArr;
void precompute(){
    for(int k = 1; k <= 800; k++){
        int c = 0;
        for(int f = 1; f <= k; f++)
            c += f * (k / f);
        capArr.push_back(c);
        if(c >= 200002) break;
    }
}
void solve(){
    int n;
    cin >> n;
    int ki = (int)(lower_bound(all(capArr), n) - capArr.begin());
    int k = ki + 1;
    cout<<k;
    nl;
    vi arr;
    int remaining = n, val = 1;
    for(int f = k; f >= 1 && remaining > 0; f--){
        int groups = min(k / f, remaining / f);
        for(int g = 0; g < groups; g++){
            for(int j = 0; j < f; j++)
                arr.push_back(val);
            remaining -= f;
            val++;
        }
    }
    for(int i = 0; i < n; i++)
        cout << arr[i] << " \n"[i == n-1];
}
signed main(){
    fastIO();
    precompute();
    int tt=1;
    cin>>tt;
    while(tt--) {
        solve();
    }
    return 0;
}