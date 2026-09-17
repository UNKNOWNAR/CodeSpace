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
    int a[n],b[n];
    for(int i=0;i<n;i++)    cin>>a[i];
    for(int i=0;i<n;i++)    cin>>b[i];
    vector<int> aSubarray(2*n+1);
    vector<int> bSubarray(2*n+1);
    int count = 1;
    for(int i=1;i<n;i++){
        if(a[i-1]==a[i])    count++;
        else{
            aSubarray[a[i-1]] = max(aSubarray[a[i-1]], count);
            count = 1;
        }
    }
    aSubarray[a[n-1]] = max(aSubarray[a[n-1]], count);
    count = 1;
    for(int i=1;i<n;i++){
        if(b[i-1]==b[i])    count++;
        else{
            bSubarray[b[i-1]] = max(bSubarray[b[i-1]], count);
            count = 1;
        }
    }
    bSubarray[b[n-1]] = max(bSubarray[b[n-1]], count);
    int ans = 1;
    for(int i=1;i<2*n+1;i++)
        ans = max(ans, aSubarray[i] + bSubarray[i]);
    cout<<ans<<endl;
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