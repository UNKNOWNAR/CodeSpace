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
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    vector<int> bits(31,0);
    for(auto x:arr){
        for(int i=0;i<31;i++){
            if((x>>i)&1)
                bits[i]++;//count all set bits
        }
    }
    int bitnum = 30;
    while(k>=0&&bitnum>=0){
        if(k>=n-bits[bitnum]){
            k-=n-bits[bitnum];
            bits[bitnum] = n;
        }
       bitnum--;
    }
    bitnum = 30;
    int ans = 0;
    while(bitnum>=0){
        ans += (bits[bitnum]/n)*(1<<bitnum);
        bitnum--;
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