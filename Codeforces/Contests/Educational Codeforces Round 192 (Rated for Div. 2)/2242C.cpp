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
    vector<int> arr(n);
    map<int,int> s;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        s[arr[i]]++;
    }
    int d = s.size();
    vector<int> v;
    for(auto &x:s)
        v.pb(x.second);
    sort(all(v));
    int D = v.size();
    vector<pair<int,int>> groups; 
    for(int i=0;i<D;){
        int j=i;
        while(j<D && v[j]==v[i]) j++;
        groups.push_back({v[i], j-i});
        i=j;
    }
    int G = groups.size();
    ll len = n, carry = 0, activeRuns = D, count = 0;
    for(int gi=0; gi<G; gi++){
        ll s_step = activeRuns;                 
        ll m = (ll)groups[gi].first - carry;         
        ll floor = len - (m-1)*s_step;          
        if(k >= floor && (k-floor)%s_step==0)
            count++;
        if(gi == G-1) break;                   
        len -= m*s_step;
        carry = groups[gi].first;
        activeRuns -= groups[gi].second;             
    }
    cout<<count<<endl;
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