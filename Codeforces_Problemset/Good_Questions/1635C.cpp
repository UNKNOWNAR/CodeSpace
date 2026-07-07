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
    string s;
    cin>>n>>c;
    cin>>s;
    bool flag = true;
    for(int i=0;i<n;i++){
        if(s[i]!=c){
            flag = false;
            break;
        }
    }
    if(flag){
        cout<<0<<endl;
        return;
    }
    int x = -1;
    for(int i=0;i<n;i++){
        flag = true;
        for(int j=i;j<n;j+=i+1){
            if(s[j]!=c){
                flag = false;
                break;
            }
        }
        if(flag){
            x = i+1;
            break;
        }
    }if(x!=-1){
        cout<<1<<endl;
        cout<<x<<endl;
    }else{
        cout<<2<<endl;
        cout<<n-1<< " " <<n<<endl;
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