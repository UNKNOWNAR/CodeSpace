#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
vector<bool> isPrime(1e5+1,true);
vector<int> spf(1e15+1,0);
void precompute(){
    for(int i=2;i<=1e5;i++){
        if(isPrime[i]){
            for(int j = i*i; j<=1e5; j+=i){
                spf[j] = i;
                isPrime[j] = false;
            }        
        }
    }
}
void solve() {
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    sort(all(arr));
    for(int i=n-1;i>=0;i--){
        
    }
    
}

int main() {
    fast_io; 
    int t;
    cin >> t; 
    precompute();
    while (t--) {
        solve();
    }
    return 0;
}