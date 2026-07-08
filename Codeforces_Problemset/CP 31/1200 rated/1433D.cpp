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
    vector<int> gang(n+1);
    vector<vector<int>> edges;
    for(int i=1;i<=n;i++)
        cin>>gang[i];
    bool all_equal = true;
    int val1 = 1,val2 = -1;
    for(int i=2;i<=n;i++){
        if(gang[i]!=gang[val1]){
            val2 = i;
            break;
        }
    }
    if(val2==-1){
        cout<<"NO"<<endl;
        return;
    }
    cout<<"YES"<<endl;
    for(int i=2;i<=n;i++){
        if(gang[i]==gang[val2])
            cout<<i<<" "<<val1<<endl;
        else
            cout<<i<<" "<<val2<<endl;
    }
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