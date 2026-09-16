#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define endl '\n'
void solve() {
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    bool swapped = true;
    while(swapped){
        swapped = false;
        for(int j=0;j<n-1;j++){
            if(arr[j]-arr[j+1]>1){
                swap(arr[j],arr[j+1]);
                swapped = true;
            }
        }
    }
    for(auto it:arr)
        cout<<it<<" ";
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