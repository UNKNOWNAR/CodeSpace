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
    string s;
    cin>>s;
    int ops = 0, sum = 0;
    for(int i=0;i<n;i++){
        if(s[i]=='(')
            sum++;
        else
            sum--;
        if(sum<0){
            ops++;
            sum=0;
        }
    }
    cout<<ops<<endl;
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