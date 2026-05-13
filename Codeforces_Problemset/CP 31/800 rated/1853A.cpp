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
    for(int i=0;i<n;i++)
        cin>>a[i];
    if(!is_sorted(a,a+n)){
        cout<<0<<endl;
        return;
    }
    int min_diff = INT_MAX;
    for(int i=1;i<n;i++){
        min_diff = min(min_diff,a[i]-a[i-1]);
    }
    if(min_diff%2==0)
        cout<<min_diff/2+1<<endl;
    else
        cout<<(min_diff+1)/2<<endl;
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