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
    string pattern;
    cin>>pattern;
    int operation = 0;
    int size = 0;
    for(int i=0;i<n;i++){
        if(pattern[i]=='.')
            size++;
        else{
            if(size>=3){
                cout<<"2"<<endl;
                return;
            }
            operation += size;
            size = 0;
        }
    }
    if(size>=3){
        cout<<"2"<<endl;
        return;
    }
    operation += size;
    cout<<operation<<endl;
}

int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) 
        solve();
    return 0;
}