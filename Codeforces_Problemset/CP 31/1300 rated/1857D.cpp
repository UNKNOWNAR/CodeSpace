#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    vector<int> a(n),b(n);
    for(int i=0;i<n;i++)
        cin>>a[i];
    for(int i=0;i<n;i++)
        cin>>b[i];
    int ans = 0;
    for(int i=0;i<n;i++)
        a[i]-=b[i];
    int maxi = *max_element(all(a));
    int cnt = 0;
    for(int i=0;i<n;i++)
        if(a[i]==maxi)
            cnt++;
    cout<<cnt<<endl;
    for(int i=0;i<n;i++)
        if(a[i]==maxi)
            cout<<i+1<<" ";
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