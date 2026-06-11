#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,c;
    cin>>n>>c;
    vector<int> arr(n);
    for(int i=0;i<n;i++){    
        cin>>arr[i];
        arr[i] += i+1;
    }
    sort(all(arr));
    int indx = 0;
    while(indx<n&&c>=arr[indx]){
        c -= arr[indx++];
    }
    cout<<indx<<endl;
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