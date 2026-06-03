#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++) cin>>a[i];
    int ops = 0;
    vector<int> indx;
    for(int i=n-1;i>=0;i--){
        if((a[i]<0&&ops%2==0)||(a[i]>0&&ops%2!=0)||(a[i]==0))
            continue;
        ops++;
        indx.pb(i+1);
    }
    cout<<ops<<endl;
    for(auto &it:indx)
        cout<<it<<" ";
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