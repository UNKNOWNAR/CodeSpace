#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,l,r;
    cin>>n>>l>>r;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int left = 0,right = 0;
    for(int i=0;i<l-1;i++)
        left += arr[i];
    for(int i=r;i<n;i++)
        right += arr[i];
    cout<<max(left,right)<<endl;
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