#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll a,b;
    cin>>a>>b;
    int ops = 0;
    int maxOps = 32;
    if(a%b!=0&&b%a!=0){
        cout<<-1<<endl;
        return;
    }
    while(maxOps--){
        if(a==b){
            cout<<ops<<endl;
            return;
        }
        if(a%b==0){
            if(a%8==0&&b<=a/8)
                a/=8;
            else if(a%4==0&&b<=a/4)
                a /= 4;
            else if(a%2==0&&b<=a/2)
                a /= 2;
            else{    
                cout<<-1<<endl;
                return;
            }
        }
        else if(b%a==0){
            if(b>=8*a)
                a *= 8;
            else if(b>=4*a)
                a *= 4;
            else if(b>=2*a)
                a *= 2;
            else{    
                cout<<-1<<endl;
                return;
            }
        }
        ops++;
    }
    if(a==b)
        cout<<ops<<endl;
    else    
        cout<<-1<<endl;
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