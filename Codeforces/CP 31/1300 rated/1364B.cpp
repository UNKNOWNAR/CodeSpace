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
    vector<int> temp;
    temp.push_back(arr[0]);
    for(int i=1;i<n-1;i++){
        if ((arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) || 
            (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])) {
            temp.push_back(arr[i]);
        }
    }
    temp.push_back(arr[n-1]);
    cout<<temp.size()<<endl;
    for(auto x:temp)
        cout<<x<<" ";
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