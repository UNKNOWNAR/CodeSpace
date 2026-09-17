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
    set<int> unique;
    bool found_duplicate = false;
    for(int i=0;i<n;i++){
        int temp;
        cin>>temp;
        if(unique.count(temp))
            found_duplicate = true;
        unique.insert(temp);
    }
    if(found_duplicate)
        cout<<"YES"<<endl;
    else
        cout<<"NO"<<endl;
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