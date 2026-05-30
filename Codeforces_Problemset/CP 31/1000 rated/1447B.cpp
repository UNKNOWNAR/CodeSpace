#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,m,smallest=1e9,no_negative=0;
    cin>>n>>m;
    ll sum = 0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            int temp;
            cin>>temp;
            if(temp<0)
                no_negative++;
            sum += abs(temp);
            smallest = min(smallest,abs(temp));
        }
    }
    if(no_negative%2!=0)
        sum -= 2LL*smallest;
    cout<<sum<<endl;
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