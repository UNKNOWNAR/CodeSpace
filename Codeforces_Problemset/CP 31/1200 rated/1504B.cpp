#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    string a,b;
    cin>>n>>a>>b;
    int flip = 0;
    vector<int> balance(n);
    balance[0] = (a[0]=='1'?1:-1);
    for(int i=1;i<n;i++)
        balance[i] =balance[i-1]+(a[i]=='1'?1:-1);
    for(int i=n-1;i>=0;i--){
        if(flip==0){
            if(a[i]==b[i])
                continue;
            else{
                if(balance[i]==0)
                    flip = (flip+1)%2;
                else{
                    cout<<"NO"<<endl;
                    return;
                }
            }
        }
        else if(a[i]==b[i]){
            if(balance[i]==0)
                flip = (flip+1)%2;
            else{
                cout<<"NO"<<endl;
                return;
            }
        }
    }
    cout<<"YES"<<endl;
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