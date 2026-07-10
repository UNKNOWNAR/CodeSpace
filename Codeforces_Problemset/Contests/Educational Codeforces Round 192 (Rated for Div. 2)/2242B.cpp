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
    vector<int> arr(n);
    for(int i=0;i<n;i++)
        cin>>arr[i];
    int c1 = 0,c2 = 0,c3 =0;
    int i = 0;
    for(int j=i;j<n;j++){
        if(arr[j] == 1) c1++;
        else if(arr[j] == 2) c2++;
        else c3++;
        i++;
        if(c1>=c2+c3){
            while(i<n&&arr[i]==3&&c1>c2+c3){
                c3++;
                i++;
            }
            break;
        }
    }
    if(i==n){
        cout<<"NO"<<endl;
        return;
    }
    c1 = 0,c2 = 0,c3 =0;
    for(int j=i;j<n;j++){
        if(arr[j] == 1) c1++;
        else if(arr[j] == 2) c2++;
        else c3++;
        i++;
        if(c1+c2>=c3)
            break;
    }
    if(i==n)
        cout<<"NO"<<endl;
    else
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