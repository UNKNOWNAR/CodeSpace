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
    set<int> isPresent;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        isPresent.insert(arr[i]);
    }
    for(int i=0;i<n;i++){
        if(isPresent.contains(arr[i]-k)){
            cout<<"YES"<<endl;
            return;
        }
    }
    cout<<"NO"<<endl;
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