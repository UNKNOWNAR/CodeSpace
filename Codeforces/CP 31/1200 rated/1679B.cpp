#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,q;
    cin>>n>>q;
    ll sum = 0;
    vector<int> arr(n+1);
    for(int i=1;i<=n;i++)
        cin>>arr[i],sum+=arr[i];
    vector<int> last_element_update(n + 1, -1);
    int last_global_update = -2;
    int global_val = -1;
    for(int i=0;i<q;i++){
        int type;
        cin>>type;
        if(type==1){
            int x,indx;
            cin>>indx>>x;
            int curr = arr[indx];
            if(last_element_update[indx]<last_global_update) curr = global_val;
            sum -= curr;
            sum += x;
            arr[indx] = x;
            last_element_update[indx] = i;
        }
        else{
            int x;
            cin>>x;
            sum = 1LL*n*x;
            global_val = x;
            last_global_update = i;
        }
        cout<<sum<<endl;
    }
}

int main() {
    fast_io; 
    int t=1;
    //cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}