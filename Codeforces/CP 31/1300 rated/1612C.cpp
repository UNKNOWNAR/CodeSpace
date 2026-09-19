#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll k,x;
    cin>>k>>x;
    if((__int128)k*k<=x)
        cout<<k*2-1<<endl;
    else if((__int128)(k+1)*(k)/2>=x){
        ll low = 1,high = k;
        while(low<=high){
            ll mid = (low+high)>>1;
            if((__int128)(mid+1)*mid/2>=x)high = mid-1;
            else low = mid+1;
        }
        cout<<low<<endl;
    }
    else{
        x -= (__int128)k*(k+1)/2;
        ll low = 0,high = k-1;
        while(low<high){
            ll mid = (low+high)>>1;
            __int128 sum = (__int128)mid * (2LL * k - mid - 1) / 2;
            if (sum >= x)
                high = mid;
            else low = mid+1;
        }
        cout<<k+low<<endl;
    }
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