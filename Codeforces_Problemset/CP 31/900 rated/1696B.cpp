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
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int ans = 0;
    bool flag = false;
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            if (flag&&arr[i-1]!=0) 
                ans++;
            if(!flag&&i>0&&arr[i-1]!=0)
                ans++;
            flag=!flag;
        }
    }
    if(flag&&arr[n-2]!=0)
        ans++;
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