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
    int s[n];
    for(int i=0;i<n;i++)    cin>>s[i];
    if(s[0]!=s[1]||s[n-1]!=s[n-2]){
        cout<<-1<<endl;
        return;
    }
    for(int i=1;i<n-1;i++){
        if(s[i-1]!=s[i]&&s[i]!=s[i+1]){
            cout<<-1<<endl;
            return;
        }
    }
    int start = 0;
    int ans[n];
    for(int i=1;i<n;i++){
        if(s[i-1]==s[i])
            ans[i] = i;
        else{
            ans[start] = i;
            start = i;
        }
    }
    ans[start] = n;
    for(int i=0;i<n;i++)
        cout<<ans[i]<< " ";
    cout<<endl;
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