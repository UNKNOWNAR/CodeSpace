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
    ll arr[n];
    for(int i=0; i<n; i++)
        cin>>arr[i];
    int ops = 0;
    for(int i=n-2;i>=0;i--){
        if(arr[i+1]==0){
            cout<<-1<<endl;
            return;
        }
        while(arr[i]>=arr[i+1] && arr[i]!=0){
            arr[i]/=2;
            ops++;
        }
    }
    cout<<ops<<endl;
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