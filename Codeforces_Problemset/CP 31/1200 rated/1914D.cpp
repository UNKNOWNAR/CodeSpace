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
    vector<pair<int,int>> a(n);
    int temp = 0;
    for(int i=0;i<n;i++){
        cin>>temp;
        a[i] = {temp,i};
    }
    vector<pair<int,int>> b(n);
    for(int i=0;i<n;i++){
        cin>>temp;
        b[i] = {temp,i};
    }
    vector<pair<int,int>> c(n);
    for(int i=0;i<n;i++){
        cin>>temp;
        c[i] = {temp,i};
    }
    sort(rbegin(a),rend(a));
    sort(rbegin(b),rend(b));
    sort(rbegin(c),rend(c));
    int ans = 0;
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            for(int k=0;k<3;k++){
                if(a[i].second!=b[j].second&&b[j].second!=c[k].second&&a[i].second!=c[k].second)
                    ans = max(ans,a[i].first+b[j].first+c[k].first);
            }
        }
    }
    cout<<ans<<endl;
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