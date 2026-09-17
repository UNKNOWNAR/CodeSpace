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
    int arr[n*k];
    for(int i=0;i<n*k;i++) cin>>arr[i];
    ll sum = 0;
    int x = n/2;
    int i=n*k-1;
    while(k--){
        sum+= arr[i-x];
        i-=x+1;
    }
    cout<<sum<<endl;
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