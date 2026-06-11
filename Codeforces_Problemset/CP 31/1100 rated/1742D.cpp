#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve(vector<vector<int>> &coprimes) {
    int n;
    cin>>n;
    int a[n];
    for(auto &x:a)  cin>>x;
    map<int,int> indx;
    for(int i=0;i<n;i++)    indx[a[i]] = i+1;
    int ans=-1;
    for(int i=1;i<=1000;i++){
        if(indx[i]==0)
            continue;
        for(auto &x:coprimes[i]){
            if(indx[x]!=0)
                ans = max(ans,indx[i]+indx[x]);
        }
    }
    cout<<ans<<endl;
}

int main() {
    fast_io; 
    int t;
    cin >> t; 
    vector<vector<int>> coprimes(1001);
    for(int i=1;i<=1000;i++){
        for(int j=1;j<=1000;j++){
            if(gcd(i,j)==1)
                coprimes[i].pb(j);
        }
    }
    while (t--) {
        solve(coprimes);
    }
    return 0;
}