#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    string s;
    cin>>n>>s;
    bool found = true;
    int l = 0;
    for(int i=1;i<n;i++){
        if(s[i-1]>s[i]){
            l = i;
            found = false;
            break;
        }
    }
    if(found)
        cout<<"NO"<<endl;
    else{
        cout<<"YES"<<endl;
        cout<<l<<" "<<l+1<<endl;
    }
}

int main() {
    fast_io; 
    solve();
    return 0;
}