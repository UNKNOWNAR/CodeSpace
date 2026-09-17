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
    vector<int> a(n),A(n);
    for(auto &x:a)  cin>>x;
    for(auto &x:A)  cin>>x;
    int l = 0,r=n-1;
    for(int i=0;i<n;i++){
        if(a[i]!=A[i])
            break;
        l++;
    }
    for(int i=n-1;i>=0;i--){
        if(a[i]!=A[i])
            break;
        r--;
    }
    while(l>0){
        if(A[l-1]<=A[l])
            l--;
        else
            break;
    }
    while(r<n-1){
        if(A[r+1]>=A[r])
            r++;
        else
            break;
    }
    cout<<(l+1)<<" "<<(r+1)<<endl;
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