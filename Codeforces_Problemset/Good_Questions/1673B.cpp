#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    string s;
    cin>>s;
    int n = s.size();
    set<char> unique;
    int k = 0;
    while(k<n){
        if(!unique.contains(s[k]))
            unique.insert(s[k]);
        else 
            break;
        k++;
    }
    for(int i=k;i<n;i++){
        if(s[i]!=s[i-k]){
            cout<<"NO"<<endl;
            return;
        }
    }
    cout<<"YES"<<endl;
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