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
    int n, k;
    cin >> n >> k;
    vi count(n + 2, 0);
    for(int i = 0; i < n; i++){
        int x;
        cin >> x;
        if(x <= n + 1) 
            count[x]++;
    }
    for(int i = 0; i <= n + 1; i++){
        if(count[i] < 2 * k){
            if(count[i] == 2 * k - 1)
                cout << "YES";
            else 
                cout << "NO";
            return;
        }
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