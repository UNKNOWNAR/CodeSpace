#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    ll x,sum = 0;
    cin>>n>>x;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    sort(all(arr));
    ll packs = 0;
    for (int i = 0; i<n; i++) {
        sum += arr[i];
        if(x>=sum)
            packs +=(x-sum)/(i+1) + 1;
    }
    cout<<packs<<endl;
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