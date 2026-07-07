#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    string s;
    cin>>n>>s;
    int count_0 = 0;
    for(int i=0;i<n;i++){ 
        if(s[i]=='0')
            count_0++;
    }
    if(count_0 == 0)
        cout << "DRAW" << endl;
    else if(count_0 == 1)
        cout << "BOB" << endl;
    else if(count_0 % 2 == 0) 
        cout << "BOB" << endl;
    else 
        cout << "ALICE" << endl;
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