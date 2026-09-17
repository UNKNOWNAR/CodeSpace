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
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[i];
    sort(arr,arr+n);
    int longest = 0;
    int len = 0;
    for(int i=0;i<n-1;i++){
        if(arr[i+1]-arr[i]<=k){
            len++;
        }else{
            longest = max(longest,len);
            len = 0;
        }
    }
    longest = max(longest,len);
    cout<<n-longest-1<<endl;
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