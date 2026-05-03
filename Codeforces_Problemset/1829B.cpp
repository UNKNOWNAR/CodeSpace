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
    for(int i=0;i<n;i++)cin>>arr[i];
    int c=0;
    int maxc=0;
    for(int i=0;i<n;i++){
        if(arr[i]==0)c++;
        else{
            maxc=max(maxc,c);
            c=0;
        }
    }
    maxc=max(maxc,c);
    cout<<maxc<<endl;
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