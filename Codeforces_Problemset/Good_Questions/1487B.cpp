#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k;
    cin>>n>>k;
    k--;
    if(n%2==0){
        cout<<(k)%n+1<<endl;
        return;
    }
    int val = n/2;
    cout<<((k+(k/val))%n)+1<<endl;
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