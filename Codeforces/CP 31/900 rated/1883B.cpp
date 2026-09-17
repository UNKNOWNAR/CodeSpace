#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k;
    cin>>n>>k;
    string s;
    cin>>s;
    map<char,int> freq;
    for(char c:s){
        freq[c]++;
    }
    int odd_Count=0;
    for(auto it:freq){
        if(it.second%2==1){
            odd_Count++;
        }
    }
    if(odd_Count>k+1){
        cout<<"NO"<<endl;
    }
    else{
        cout<<"YES"<<endl;
    }
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