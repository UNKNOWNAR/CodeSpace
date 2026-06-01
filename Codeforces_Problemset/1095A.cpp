#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int modulo =  676767677;
    int n;
    cin>>n;
    vector <int> arr(n);
    for(int i=0;i<n;i++) cin>>arr[i];
    bool allOnes = true;
    for(int i=0;i<n;i++){
        if(arr[i]!=1) allOnes = false;
    }
    if(allOnes){
        cout<<1<<endl;
        return;
    }
    ll ans = 0;
    int unmatchedOnes = 0;
    for(int i = 0; i<n;i++){
        if(arr[i]==1)
            unmatchedOnes++;
        else{
            ans = (ans+arr[i])%modulo;
            if(unmatchedOnes>0) unmatchedOnes--;
        }   
    }
    ans = (ans+unmatchedOnes)%modulo;
    cout<<ans<<endl;
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