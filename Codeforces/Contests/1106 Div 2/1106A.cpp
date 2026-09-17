#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,c;
    cin>>n>>c;
    vector<int> a(n),b(n);
    for(int i=0;i<n;i++)
        cin>>a[i];
    for(int i=0;i<n;i++)
        cin>>b[i];
    int time = 0;
    for(int i=0;i<n;i++){
        if(a[i]>=b[i])
            time += a[i]-b[i];
        else{
            time = 1e9;
            break;
        }
    }
    sort(all(a));
    sort(all(b));
    int time2 = c;
    for(int i=0;i<n;i++){
        if(a[i]>=b[i])
            time2 += a[i]-b[i];
        else{
            time2 = -1;
            break;
        }
    }
    cout<<min(time,time2)<<endl;
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