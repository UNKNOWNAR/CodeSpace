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
    int m = n*(n-1)/2;
    vector<int> b(m);
    for(int i=0;i<m;i++)
        cin>>b[i];
    sort(all(b));
    int x = n-1,i=0;
    while(x>0){
        cout<<b[i]<<" ";
        i += x;
        x--;
    }
    cout<<(int)1e9<<endl;
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