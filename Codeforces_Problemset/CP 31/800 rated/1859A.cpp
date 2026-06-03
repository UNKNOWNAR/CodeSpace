#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
bool isPrime(int n){
    for(int i=2;i*i<=n;i++){
        if(n%i==0)
            return false;
    }
    return true;
}
void solve() {
    int n;
    cin >> n;
    int a[n];
    for (int i = 0; i < n; i++) cin >> a[i];
    vector<int> b;
    vector<int> c;
    int max = *max_element(a,a+n);
    for(int i=0;i<n;i++){
        if(a[i]==max)
            c.pb(a[i]);
        else
            b.pb(a[i]);
    }
    if(c.size()==0||b.size()==0)
        cout<<-1<<endl;
    else{
        cout<<b.size()<<" "<<c.size()<<endl;
        for(auto x:b)
            cout<<x<<" ";
        cout<<endl;
        for(auto x:c)
            cout<<x<<" ";
        cout<<endl;
    }
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