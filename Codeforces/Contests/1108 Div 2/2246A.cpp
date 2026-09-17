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
    vector<int> p(n+1);
    int even = 2, odd = 1;
    for(int i=1;i<=n;i++){
        if(i&1){
            p[i] = even;
            even += 2;
        } 
        else{
            p[i] = odd;
            odd += 2;
        }
    }
    for(int i=1;i<=n;i++)
        cout<<p[i]<<" ";
    cout<<endl;
}
int main() {
    fast_io; 
    int t;
    cin>>t; 
    while(t--){
        solve();
    }
    return 0;
}