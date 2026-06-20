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
    vector<int> a(n);
    for(int i=0;i<n;i++)
        cin>>a[i];
    vector<int> b(n);
    for(int i=0;i<n;i++)
        cin>>b[i];
    ll ans = 0;
    for(int i=0;i<n;i++){
        int j = i;
        while(j<n&&b[i]<a[j])
            j++;
        if(j==n){
            cout<<-1<<endl;
            return;
        }
        while(j>i){
            swap(a[j],a[j-1]);
            ans++;
            j--;
        }
    }
    cout<<ans<<endl;
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