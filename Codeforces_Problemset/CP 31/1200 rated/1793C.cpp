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
    vector<int> arr(n+1);
    for(int i=1;i<=n;i++)
        cin>>arr[i];
    if(n<4){
        cout<<-1<<endl;
        return;
    }
    int max = n,min = 1,l=1,r=n;
    while(max!=arr[l]||max!=arr[r]||min!=arr[l]||min!=arr[r])
    {
        if(arr[l]==min){
            l++;
            min++;
        }
        else if(arr[l]==max){
            l++;
            max--;
        }
        else if(arr[r]==min){
            r--;
            min++;
        }
        else if(arr[r]==max){
            r--;
            max--;
        }
        else
            break;
    }
    if(l>=r)
        cout<<-1<<endl;
    else
        cout<<l<<' '<<r<<endl;
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