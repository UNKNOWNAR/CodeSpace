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
    for(char c = 'a';c<='z';c++){
        if(s.find(c)==string::npos){
            cout<<c<<endl;
            return;
        }
    }
    for(char c = 'a';c<='z';c++){
        for(char c1 = 'a';c1<='z';c1++){
            string temp ="";
            temp.pb(c);
            temp.pb(c1);
            if(s.find(temp)==string::npos){
                cout<<temp<<endl;
                return;
            }
        }
    }
    for(char c = 'a';c<='z';c++){
        for(char c1 = 'a';c1<='z';c1++){
            for(char c2 = 'a';c2<='z';c2++){
                string temp ="";
                temp.pb(c);
                temp.pb(c1);
                temp.pb(c2);
                if(s.find(temp)==string::npos){
                    cout<<temp<<endl;
                    return;
                }
            }
        }
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