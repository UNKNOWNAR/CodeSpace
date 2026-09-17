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
    vector<pair<ll,ll>> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i].first;
        arr[i].second = i+1;
    }
    sort(all(arr));
    int count = 0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i].first*arr[j].first>=2*n)
                break;
            if(arr[i].first*arr[j].first == arr[i].second+arr[j].second)
                count++;
        }
    }
    cout<<count<<endl;
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