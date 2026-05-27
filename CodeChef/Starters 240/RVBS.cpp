#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n;
    string a,b;
    cin>>n>>a>>b;
    if(a==b){
        cout<<0<<endl;
        return;
    }
    int c1_a = 0, c1_b = 0;
    for(int i =0; i<n;i++){
        if(a[i]== '1') c1_a++;
        if(b[i]== '1') c1_b++;
    }
    if(c1_a!=c1_b){
        cout<<-1<<endl;
        return;
    }
    int indx1 = 0, indx2=0,ops=0;
    while(indx1<n && indx2<n){
        while(a[indx1]!='1' && indx1<n) indx1++;
        while(b[indx2]!='1' && indx2<n) indx2++;
        if(indx1<n && indx2<n && indx1!=indx2){
            ops++;
        }
        indx1++;
        indx2++;
    }
    cout<<ops<<endl;    
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