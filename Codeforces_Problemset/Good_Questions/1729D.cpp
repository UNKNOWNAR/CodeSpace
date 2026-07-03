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
    vector<int> x(n),y(n),z(n);
    for(int i=0;i<n;i++)
        cin>>x[i];
    for(int i=0;i<n;i++)
        cin>>y[i];
    for(int i=0;i<n;i++)
        z[i] = y[i]-x[i];
    sort(all(z));
    int groups = 0;
    int left = 0, right = n-1;
    while(left < right) {
        if(z[left] + z[right] >= 0) {
            groups++;
            left++;
            right--;
        } else {
            left++;
        }
    }
    cout<<groups<<endl;
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