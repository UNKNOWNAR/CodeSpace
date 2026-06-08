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
    vector<int> a(n),b(n);
    for(int i=0;i<n;i++)    cin>>a[i];
    for(int i=0;i<n;i++)    cin>>b[i];
    sort(all(b));
    sort(all(a));
    ll count = 1;
    int mod = 1e9+7;
    int ptr = n-1;
    for(int i=n-1;i>=0;i--){
        while(ptr>=0&&a[ptr]>b[i])
            ptr--;
        ll valid_choices = (n - 1 - ptr) - (n - 1 - i);
        if (valid_choices <= 0) {
            count = 0;
            break;
        }
        count = (count * (valid_choices)%mod)%mod;
    }
    cout<<count<<endl;
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