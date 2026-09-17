#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    string s;
    cin>>n>>s;
    map<char,int> freq;
    for(int i=0;i<n;i++)
        freq[s[i]]++;
    map<char,int> freq1;
    int ans = freq.size();
    for(int i=0;i<n-1;i++){
        freq[s[i]]--;
        if(freq[s[i]]==0)
            freq.erase(s[i]);
        freq1[s[i]]++;
        ans = max(ans, (int)freq.size() + (int)freq1.size());
    }
    cout<<ans<<endl;
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