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
    int arr[n];
    int countTwo = 0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        if(arr[i]==2)countTwo++;
    }
    if(countTwo%2!=0){
        cout<<-1<<endl;
        return;
    }
    int secondTwo = 0;
    for(int i=0;i<n;i++){
        if(arr[i]==2)secondTwo++;
        if(secondTwo==countTwo/2){
            cout<<i+1<<endl;
            return;
        }
    }
    cout<<-1<<endl;
}
int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}