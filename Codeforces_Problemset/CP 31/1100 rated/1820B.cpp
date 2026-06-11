#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    string s;
    cin>>s;
    bool all_ones = true;
    int n = s.size();
    for(char c : s) 
        if(c == '0') all_ones = false;
    if(all_ones) {
        cout<<(ll)n*n<<endl;
        return;
    }
    s+=s;
    n = s.size();
    ll max1 = 0;
    ll count1 = 0;
    for(int i=0;i<n;i++){
        if(s[i]=='1')
            count1++;
        else{
            max1 = max(max1,count1);
            count1 = 0;
        }
    }
    max1 = max(max1,count1);
    ll ans = ((max1+1)/2)*((max1+2)/2);
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