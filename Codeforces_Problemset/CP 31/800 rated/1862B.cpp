#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) 
        cin >> arr[i];
    vector<int> b;
    b.pb(arr[0]);
    for(int i=1;i<n;i++){
        if(arr[i]>=arr[i-1])
            b.pb(arr[i]);
        else{
            b.pb(arr[i]);
            b.pb(arr[i]);
        }
    }
    cout<<b.size()<<endl;
    for(int i=0;i<b.size();i++) 
        cout<<b[i]<< " ";
    cout<<endl;     
}

int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}