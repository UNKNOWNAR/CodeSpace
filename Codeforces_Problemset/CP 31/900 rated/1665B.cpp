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
    ll arr[n];
    for(int i=0;i<n;i++)
        cin>>arr[i];
    sort(arr,arr+n);
    int maXfreq = 1;
    int curr = 1;
    for(int i=1;i<n;i++){
        if(arr[i] == arr[i-1])
            curr++;
        else{
            if(maXfreq<curr)
                maXfreq = curr;
            curr = 1;
        }
    }
    maXfreq = max(maXfreq,curr);
    int ops = 0;
    while(maXfreq < n){
        ops++;
        if(maXfreq*2<=n){
            ops += maXfreq;
            maXfreq *= 2;
        }
        else{
            ops += n-maXfreq;
            maXfreq = n;
        }
    }
    cout<<ops<<endl;
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