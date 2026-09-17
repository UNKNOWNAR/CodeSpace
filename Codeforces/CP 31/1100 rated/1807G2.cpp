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
    vector<int> arr(n);
    for(int i=0;i<n;i++)    cin>>arr[i];
    sort(all(arr));
    if(arr[0]!=1){
        cout<<"NO"<<endl;
        return;
    }
    ll sum = 1;
    for(int i=1;i<n;i++){
        if(arr[i]>sum){
            cout<<"NO"<<endl;
            return;
        }
        sum += arr[i];
    }
    cout<<"YES"<<endl;
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