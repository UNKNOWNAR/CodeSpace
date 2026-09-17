#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {//I cannot turn off the 2^MSB-1 bit value for any permutation of 0 to N-1 so the maxm value can be 2^MSB-1 we have to make the array such that this value is created having MSB with 0 and 1 in two segments for goof results
    int n;
    cin>>n;
    int msb = 0;
    int temp = n-1;
    while(temp>0){
        msb++;
        temp=temp>>1;
    }
    temp = (1<<(msb-1))-1;
    while(temp>=0){
        cout<<temp<<" ";
        temp--;
    }
    temp = 1<<(msb-1);
    while(temp<n){
        cout<<temp<<" ";
        temp++;
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