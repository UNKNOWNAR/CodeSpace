#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    string s,t;
    cin>>s>>t;
    int freqMap[26] = {0};
    for(char c:t)
        freqMap[c-'A']++;
    for(int i=s.length()-1;i>=0;i--){
        if(freqMap[s[i]-'A'] >0)
            freqMap[s[i]-'A']--;
        else
            s[i] = '#';   
    }
    string finalString = "";
    for(int i=0;i<s.length();i++){
        if(s[i] != '#')
            finalString += s[i];
    }
    if(finalString == t) cout<<"YES"<<endl;
    else cout<<"NO"<<endl;
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