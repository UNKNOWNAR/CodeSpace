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
    vector<pair<int,int>> arr(n);
    for(int i=0;i<n;i++){ 
        cin>>arr[i].first;
        arr[i].second = i;
    }
    sort(all(arr));
    vector<ll> prefix(n);
    prefix[0] = arr[0].first;
    for(int i=1;i<n;i++){
        prefix[i] += prefix[i-1] + arr[i].first;
    }
    vector<int> ans(n);
    ans[arr[n - 1].second] = n - 1;
    for(int i=n-2;i>=0;i--){
        if(prefix[i]>=arr[i+1].first)
            ans[arr[i].second] =  ans[arr[i+1].second];
        else
            ans[arr[i].second] = i;
    }
    for(int i=0;i<n;i++)
        cout<<ans[i]<<" ";
    cout<<endl;
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