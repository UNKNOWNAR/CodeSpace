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
    int j = 0;
    for(int k=1;k<=n;k++){
        int low = 0,high = k-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=k-mid)
                high = mid;
            else
                low = mid+1;
        }
        cout<<k-low<< " ";
    }
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