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
    for(int i=0;i<n;i++)
        cin>>arr[i];
    vector<int> lastDiff(n,-1);
    for(int i=1;i<n;i++){
        if(arr[i]!=arr[i-1])
            lastDiff[i] = i-1;
        else
            lastDiff[i] = lastDiff[i-1];
    }
    int q;
    cin>>q;
    for(int i=0;i<q;i++){
        int l,r;
        cin>>l>>r;
        l--;
        r--;
        if(lastDiff[r]>=l)
            cout<<lastDiff[r]+1<<" "<<r+1<<endl;
        else
            cout<<"-1 -1"<<endl;
    }
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