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
    ll sum = 0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        sum = sum | arr[i];
    }
    int ans = 0;
    ll current_or = 0;
    for(int i=0;i<n;i++){
        current_or = current_or|arr[i];
        ans++;
        if(current_or==sum){
            ans--;
            current_or = 0;
        }
    }
    cout<<ans<<endl;
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