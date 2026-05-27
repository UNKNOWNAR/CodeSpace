#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
     int X,Y,A,B;
    cin>>X>>Y>>A>>B;
    if(X>A)
        cout<<"ALICE"<<endl;
    else if(X<A)
        cout<<"BOB"<<endl;
    else{
        if(Y>B)
            cout<<"ALICE"<<endl;
        else if(Y<B)
            cout<<"BOB"<<endl;
        else
            cout<<"ALICE"<<endl;
    }
}

int main() {
    fast_io; 
    solve();
    return 0;
}