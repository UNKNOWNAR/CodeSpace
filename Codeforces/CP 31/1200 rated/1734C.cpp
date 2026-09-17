#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    string t;
    cin>>n>>t;
    vector<bool> deleted(n,false);
    ll cost = 0;
    for(int i=0;i<n;i++){//Time complexity is not exactly O(N^2) because we are using O(N(N/1+N/2+N/3+N/4+...N/N)) which is O(NlogN)
        for(int j=i;j<n;j+=i+1){
            if(deleted[j])
                continue;
            if(t[j]=='0'){
                deleted[j] = true;
                cost += i+1;
            }
            else
                break;
        }
    }
    cout<<cost<<endl;
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