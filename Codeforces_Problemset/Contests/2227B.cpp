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
    int closingBracket = 0;
    int openingBracket = 0;
    for(int i=0;i<n;i++){
        char temp;
        cin>>temp;
        if(temp==')')
            closingBracket++;
        else
            openingBracket++;
    }
    if(closingBracket==openingBracket)
        cout<<"YES"<<endl;
    else
        cout<<"NO"<<endl;
    
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