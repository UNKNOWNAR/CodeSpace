#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void check(int arr[],int n){
    if(is_sorted(arr,arr+n)){
        cout<<"YES"<<endl;
        return;
    }
    int peak = 0;
    for(int i=n-2;i>=1;i--){
        if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
            peak++;
            swap(arr[i],arr[i+1]);
        }
    }
    if(peak==0){
        cout<<"NO"<<endl;
        return;
    }
    check(arr,n);
}
void solve() {
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[i]; 
    check(arr,n);   
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