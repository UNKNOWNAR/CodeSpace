#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    string x;
    cin>>x;
    /*
    By picking y = 10^L + 1 (where L is the number of digits in x), multiplying x * y essentially concatenates x with itself (e.g., x * (10^L + 1) = x * 10^L + x). which is good in the process
    */
    int L = x.size();
    ll y = 1;
    for(int i=0;i<L;i++)
        y *= 10;
    cout<<y+1<<endl;
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