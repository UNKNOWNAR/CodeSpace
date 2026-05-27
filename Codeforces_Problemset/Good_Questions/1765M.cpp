#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {//a and n-a must have lcm n-a i.e. n-a must be a multiple of a i.e. n must be a multiple of a i.e. a must be a divisor of n i.e. a and n-a are coprime so we need to find the largest divisor of n less than n and a<n/2 and a<sqrt(n) with this we find a so we get LCM which is minimum
    int n;
    cin>>n;
    int a=1;
    for(int i=2;i*i<=n;i++){
        if(n%i==0)
            a = max(a,max(i, n/i));
    }
    cout<<a<<" "<<n-a<<endl;
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