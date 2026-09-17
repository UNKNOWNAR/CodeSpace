#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    vector<string> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int count=0;
    for(int i=0;i<=n/2;i++){
        for(int j=i;j<n-i-1;j++){
            int temp=(arr[i][j]-'0'+arr[j][n-i-1]-'0'+arr[n-i-1][n-j-1]-'0'+arr[n-j-1][i]-'0');
            count+=min(temp,4-temp);
        }
    }
    cout<<count<<endl;
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