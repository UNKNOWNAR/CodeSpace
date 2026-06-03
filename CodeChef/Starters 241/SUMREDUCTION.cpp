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
    vector<ll> a(n);
    for(int i=0;i<n;i++)
        cin>>a[i];
    int size = n;
    while(n--){
        if(size==1)
            break;
        for(int i=0;i<size;i++){
            bool flag = false;
            for(int j=i+1;j<size;j++){
                if((a[i]&a[j])==0){
                    ll temp = a[i]+a[j];
                    a[i] = temp;
                    a.erase(a.begin()+j);
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        size = a.size();
    }
    if(a.size()==1) cout<<"Yes"<<endl;
    else cout<<"No"<<endl;
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