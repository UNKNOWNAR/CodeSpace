#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
int main() {
    fast_io; 
    int n;
    cin >> n;
    int ans = 1e5+1;
    while(n!=0){
        int temp;
        cin>>temp;
        ans=min(abs(temp),ans);
        n--;
    }
    cout<<ans;
    return 0;
}