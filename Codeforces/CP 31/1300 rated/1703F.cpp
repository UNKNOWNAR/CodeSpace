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
    for(int i=0;i<n;i++)
        cin>>arr[i];
    ll count = 0;
    vector<int> staisfies;
    for(int i=0;i<n;i++){
        if(arr[i]<i+1){
            count += lower_bound(staisfies.begin(),staisfies.end(),arr[i])-staisfies.begin();
            staisfies.pb(i+1);
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