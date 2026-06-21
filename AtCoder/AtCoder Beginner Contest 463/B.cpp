#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    char c;
    cin>>n>>c;
    vector<string> s(n);
    for(int i=0;i<n;i++)
        cin>>s[i];
    bool answer = false;
    for(int i=0;i<n;i++){
        if(s[i][c-'A']=='o'){
            answer=true;
            break;
        }
    }
    if(answer)
        cout<<"Yes"<<endl;
    else
        cout<<"No"<<endl;
    
}

int main() {
    fast_io; 
    int t=1;
    while (t--) {
        solve();
    }
    return 0;
}