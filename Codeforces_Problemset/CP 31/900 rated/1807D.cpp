#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,q;
    cin>>n>>q;
    ll arr[n];
    for(int i = 0; i < n; i++) 
        cin>>arr[i];
    //Preprocess prefix sum
    ll leftSum[n],rightSum[n];
    leftSum[0] = arr[0];
    rightSum[n-1] = arr[n-1];
    for(int i = 1; i < n; i++) {
        leftSum[i] = leftSum[i-1] + arr[i];
        rightSum[n-i-1] = rightSum[n-i] + arr[n-i-1];
    }
    while(q--){
        ll l,r,k;
        cin>>l>>r>>k;
        ll sub_sum = (l==1?0:leftSum[l-2]) + k*(r-l+1) + (r==n?0:rightSum[r]);
        if((sub_sum)%2!=0)   
            cout<<"YES"<<endl;
        else
            cout<<"NO"<<endl;
    }
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