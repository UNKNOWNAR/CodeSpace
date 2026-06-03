#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
// for xor of any arbitary n n%4=0 xor values till n = n n%4==1 xor = 1 n%4==2 xor = n+1 n%4==3 xor = 0
void solve(int x[]) {//MEX of an array is the minimum non-negative integer that does not belong to the array
    int a,b;
    cin>>a>>b;
    int x_xor = x[a-1];
    if(x_xor==b)
        cout<<a<<endl;
    else if((x_xor^b)!=a)
        cout<<a+1<<endl;
    else//if x-xor^b = a we add x_xor^b^(a+1) and (a+1)    
        cout<<a+2<<endl;
}

int main() {
    fast_io; 
    int t;
    cin >> t;
    int limit = 3*1e5;
    int x[limit+1];//precompute XOR values of the elements
    x[0] = 0;
    for(int i=1;i<limit;i++)
        x[i] = x[i-1]^i; 
    while (t--) {
        solve(x);
    }
    return 0;
}