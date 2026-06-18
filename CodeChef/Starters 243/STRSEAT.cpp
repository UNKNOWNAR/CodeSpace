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
    vector<int> arr(n);
    ll sum = 0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        sum += arr[i];
    }
    int count = 0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            ll fans = arr[i]+arr[j]+(sum-arr[i]-arr[j])/2;
            if(fans>k)
                count++;
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