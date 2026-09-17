#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
ll check(vector<ll> &arr,int k){
    int n = arr.size();
    ll minSum = 1e18,maxSum = 0;
    for(int j=0;j<n/k;j++){
        ll sum = 0;
        for(int i=0;i<k;i++)
            sum += arr[i+j*k];
        minSum = min(minSum,sum);
        maxSum = max(maxSum,sum);
    }
    return maxSum-minSum;
}
void solve() {
    int n;
    cin>>n;
    vector<ll> arr(n);
    for(int i=0;i<n;i++)    cin>>arr[i];
    ll maxDiff = 0;
    for(int k=1;k*k<=n;k++){
        if(n%k!=0)
            continue;
        maxDiff = max(check(arr,k),maxDiff);
        maxDiff = max(check(arr,n/k),maxDiff);
    }
    cout<<maxDiff<<endl;
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