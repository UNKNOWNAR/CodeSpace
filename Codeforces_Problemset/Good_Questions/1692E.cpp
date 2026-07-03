#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,s;
    cin>>n>>s;
    vector<int> arr(n);
    ll sum = 0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        sum+=arr[i];
    }
    if(s>sum){
        cout<<-1<<endl;
        return;
    }
    if(s==sum){
        cout<<0<<endl;
        return;
    }
    int l = 0,r = 0,maxLen = 0;
    ll current_sum = 0;
    while(r<n){
        current_sum+=arr[r];
        while(current_sum>s){
            current_sum-=arr[l];
            l++;
        }
        maxLen = max(maxLen,r-l+1);
        r++;
    }
    cout<<n-maxLen<<endl;
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