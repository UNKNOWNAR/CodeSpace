#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
bool check(int n,vector<int> arr,int l,int r,int x){
    while(l<r){
        if(arr[l]!=arr[r]){
            if(arr[l]==x)
                l++;
            else if(arr[r]==x)
                r--;
            else
                return false;
        }
        else{
            l++;
            r--;
        }
    }
    return true;
}
void solve() {
    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    if(n<3){
        cout<<"YES"<<endl;
        return;
    }
    int l=0,r=n-1,noMatch=0;
    while(l<r){
        if(arr[l]!=arr[r]){
            if(check(n,arr,l+1,r,arr[l])||check(n,arr,l,r-1,arr[r])){
                cout<<"YES"<<endl;
                return;
            }
            else{
                cout<<"NO"<<endl;
                return;
            }
        }
        l++;
        r--;
    }
    cout<<"YES"<<endl;
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