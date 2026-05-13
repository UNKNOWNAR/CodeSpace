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
    int odd_count =0;
    for(int i=0;i<n;i++){
        int temp;
        cin>>temp;
        if(temp%2!=0)
            odd_count++;
    }
    if(odd_count%2==0)
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