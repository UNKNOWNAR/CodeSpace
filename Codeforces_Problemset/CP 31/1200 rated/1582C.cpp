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
    int cost = n;
    for(int i=0;i<=25;i++){
        char c = char('a'+i);
        int l =0 ,r = n-1;
        int del = 0;
        bool match = true;
        while(l<r){
            if(s[l]==s[r]){
                l++;
                r--;
                continue;
            }
            if(s[l]==c){
                l++;
                del++;
            }
            else if(s[r]==c){
                r--;
                del++;
            }
            else{
                match = false;
                break;
            }
        }
        if(match)
            cost = min(del,cost);
    }
    if(cost==n)
        cout<<-1<<endl;
    else
        cout<<cost<<endl;
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