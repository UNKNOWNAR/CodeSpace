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
    int easy=0,hard=0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        if(arr[i]==0)
            easy++;
        else 
            hard++;
    }
    if(easy<2)
        cout<<-1<<endl;
    else if(arr[n-1]==0&&arr[0]==0)
        cout<<0<<endl;
    else if(arr[n-1]==0||arr[0]==0)
        cout<<1<<endl;
    else
        cout<<2<<endl;
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