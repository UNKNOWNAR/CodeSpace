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
    map<int,int> factorcount;
    for(int i=0;i<n;i++){
        int temp;
        cin>>temp;
        for(int x=2;x*x<=temp;x++){
            while(temp%x==0){
                factorcount[x]++;
                temp/=x;
            }
        }
        if(temp>1)
            factorcount[temp]++;
    }
    for(auto& [key,value] : factorcount){
        if(value%n!=0){
            cout<<"NO"<<endl;
            return;
        }
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