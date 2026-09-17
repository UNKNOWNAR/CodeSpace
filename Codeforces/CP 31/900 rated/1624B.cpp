#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int a,b,c;
    cin>>a>>b>>c;
    if((2*b-a)>0&&(2*b-a)%c==0||(2*b-c)>0&&(2*b-c)%a==0||(a+c)%2==0&&((a+c)/2)%b==0){
        cout<<"YES"<<endl;
    }
    else{
        cout<<"NO"<<endl;
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