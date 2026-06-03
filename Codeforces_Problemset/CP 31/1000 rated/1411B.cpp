#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
bool check(ll n){//O(18)
    ll temp = n;
    while(temp>0){
        int digit = temp%10;
        if(digit != 0 && n % digit != 0)
            return false;
        temp /= 10;
    }
    return true;
}
void solve() {
    ll x;
    cin>>x;
    int superfair = 2*3*4*5*6*7*8*9;//2520
    for(int i=0;i<superfair;i++){
        if(check(x+i)){
            cout<<x+i<<endl;
            break;
        }
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