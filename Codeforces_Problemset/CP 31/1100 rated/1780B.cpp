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
    ll total_sum = 0;
    for(auto &x:a){
        cin>>x;
        total_sum += x;
    }
    ll sum = 0;
    ll score = 0;
    for(int i=0;i<n-1;i++){
        sum += a[i];
        score = max(score,gcd(sum,total_sum-sum));
    }
    cout<<score<<endl;
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