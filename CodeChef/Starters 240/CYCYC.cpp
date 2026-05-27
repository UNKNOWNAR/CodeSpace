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
    int a[n];
    int smallest = 1e9;
    for(int i=0;i<n;i++){
        cin>>a[i];
        smallest = min(smallest,a[i]);
    }
    int freq = 0;
    for(int i=0;i<n;i++){
        if(a[i]==smallest) freq++;
    }
    if(freq>1)
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