#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define endl '\n'
void solve() {
    int n,m;
    cin>>n>>m;
    vector<int> arr(m),diff(m+1);
    for(int i=0;i<m;i++)
        cin>>arr[i];
    sort(arr.begin(),arr.end());
    for(int i=1;i<m;i++)
        diff[i]=arr[i]-arr[i-1]-1;
    diff[0]=n-arr[m-1]+arr[0]-1;
    sort(diff.rbegin(),diff.rend());
    ll saved=0;
    for(int i=0;i<m;i++){
        if(diff[i]<4*i+1)
            break;
        if(diff[i]==4*i+1)
            saved += diff[i]-4*i;
        else
            saved += diff[i]-4*i-1;
    }
    cout<<n-saved<<endl;
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