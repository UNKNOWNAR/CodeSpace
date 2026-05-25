#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,m,i,j;
    cin>>n>>m>>i>>j;
    int x1,y1,x2,y2;
    if(i>n-i)
        x1 = 1;
    else
        x1 = n;
    if(j>m-j)
        y1 = 1;
    else
        y1 = m;
    x2 = n-x1+1;
    y2 = m-y1+1;
    cout<<x1<<" "<<y1<<" "<<x2<<" "<<y2<<endl;
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