#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    ll n;
    cin>>n;
    vector<int> num;
    while(n!=0){
        num.pb(n%10);
        n=n/10;
    }
    reverse(all(num));
    int ans = 1e9;
    int indx = num.size();
    bool found0 = false;
    int cost = 0;
    while(indx--){
        if(found0&&(num[indx]==5||num[indx]==0)){
            ans = cost;
            break;
        }
        else if(!found0&&num[indx]==0)
            found0 = true;
        else
            cost++;
    }
    indx = num.size();
    bool found5 = false;
    cost = 0;
    while(indx--){
        if(found5&&(num[indx]==2||num[indx]==7)){
            ans = min(ans,cost);
            break;
        }
        else if(!found5&&num[indx]==5)
            found5 = true;
        else
            cost++;
    }
    ans = (ans==1e9)?num.size():ans;
    cout<<ans<<endl;
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