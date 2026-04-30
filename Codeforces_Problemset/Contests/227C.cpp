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
    vector<int> all2;
    vector<int> all3;
    vector<int> all6;
    vector<int> none;
    for(int i=0;i<n;i++){
        int temp;
        cin>>temp;
        if(temp%6==0)
            all6.pb(temp);
        else if(temp%2==0)
            all2.pb(temp);
        else if(temp%3==0)
            all3.pb(temp);
        else
            none.pb(temp);
    }
    vector<int> ans;
    for(auto x:all6){
        ans.pb(x);
    }
    for(auto x:all2){
        ans.pb(x);
    }
    for(auto x:none){
        ans.pb(x);
    }
    for(auto x:all3){
        ans.pb(x);
    }
    for(int i=0;i<ans.size();i++)
        cout<<ans[i]<<" ";
    cout<<endl;

}

int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}