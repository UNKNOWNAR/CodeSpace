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
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    vector<int> bits(31,0);
    for(int a:arr){
        for(int i=0;i<=30;i++){
            if(a&(1<<i))
                bits[i]++;
        }
    }
    cout<<1<<" ";
    for(int k=2;k<=n;k++){
        bool match = true;
        for(int i=0;i<=30;i++){
            if(bits[i]%k!=0){
                match = false;
                break;
            }
        }
        if(match)
            cout<<k<<" ";
    }
    cout<<endl;
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