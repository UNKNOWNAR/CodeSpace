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
    vector<vector<int>> c(n);
    map<int,int> freq;
    for(int i=0;i<n;i++){
        int q;
        cin>>q;
        while(q--){
            int x;
            cin>>x;
            c[i].push_back(x);
            freq[x]++;
        }
    }
    for(int i=0;i<n;i++){
        bool match = false;
        for(auto &x:c[i]){
            if(freq[x]==1){
                match = true;
                break;
            }
        }
        if(!match){
            cout<<"Yes"<<endl;
            return;
        }
    }
    cout<<"No"<<endl;
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