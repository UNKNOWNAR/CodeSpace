#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int l = 0, r = n-1;
    while(l<=r){
        while(arr[l]==l+1)
            l++;
        while(arr[r]==r+1)
            r--;
        if(l>r) break;
        swap(arr[l],arr[r]);
        l++;
        r--;
    }
    if(is_sorted(all(arr)))
        cout<<"YES"<<endl;
    else
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