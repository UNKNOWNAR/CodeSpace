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
    ll arr[n];
    for(int i=0;i<n;i++)    cin>>arr[i];
    ll sum = arr[0],maxSum = arr[0];
    for(int i=1;i<n;i++){
        if(sum<0)
            sum = arr[i];
        else if((arr[i-1]+arr[i])%2!=0)
            sum += arr[i];
        else
            sum = arr[i];
        maxSum = max(sum,maxSum);
    }
    cout<<maxSum<<endl;
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