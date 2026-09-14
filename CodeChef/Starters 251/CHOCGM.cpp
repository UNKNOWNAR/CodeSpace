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
    int sum = 0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        sum += arr[i];
    }
    int alice = 0;
    if(sum%2==0){
        for(int i=0;i<n;i++){
            if(arr[i]==1)
                continue;
            if(arr[i]%2==0)
                alice += arr[i];
            else
                alice += arr[i]-1;
        }
        alice += (sum - alice)/2;
        cout<<alice<<endl;
    }
    else{
        int bob = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1)
                continue;
            if(arr[i]%2==0)
                bob += arr[i];
            else
                bob += arr[i]-1;
        }
        bob += (sum-bob+1)/2;
        alice = sum - bob;
        cout<<alice<<endl;
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