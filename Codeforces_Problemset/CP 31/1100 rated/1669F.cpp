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
    ll sum = 0;
    map<ll,int> s;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        sum += arr[i];
        s[sum] = i;
    }
    int ans = 0,indx=-1;
    sum = 0;
    for(int i=n-1;i>0;i--){
        sum += arr[i];
        if(s.contains(sum)){
            if(s[sum]>=i)
                break;
            ans = s[sum]+1+(n-i);
            indx=s[sum];
        }
        if(i<indx)
            break;
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