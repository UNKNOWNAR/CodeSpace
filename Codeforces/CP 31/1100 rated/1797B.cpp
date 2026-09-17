#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k;
    cin>>n>>k;
    vector<vector<int>> arr(n, vector<int>(n));
    vector<vector<int>> arr180(n, vector<int>(n));
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++){ 
            cin>>arr[i][j];
            arr180[n-1-i][n-1-j] = arr[i][j];
        }
    }
    int diff = 0;
    for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++){ 
            if(arr[i][j]!=arr180[i][j])
                diff++;
        }
    }
    diff /= 2;
    if(k<diff)
        cout<<"NO"<<endl;
    else if(k==diff||(k-diff)%2==0||n%2!=0)
        cout<<"YES"<<endl;
    else
        cout<<"NO"<<endl;
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