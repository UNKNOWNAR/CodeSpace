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
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[i];
    sort(arr,arr+n);
    int ans[n];
    for(int i=0;i<n/2;i++){
        ans[2*i] = arr[n-i-1];
        if(n>2*i+1)
            ans[2*i+1] = arr[i]; 
    }
    if(n%2!=0) ans[n-1] = arr[n/2];
    int sum = 0;
    for(int i=0;i<n;i++){
        if(sum==ans[i]){
            cout<<"NO"<<endl;
            return;
        }
        sum+=ans[i];
    }
    cout<<"YES"<<endl;
    for(int i=0;i<n;i++) cout<<ans[i]<<" ";
    cout<<endl;
}

int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}