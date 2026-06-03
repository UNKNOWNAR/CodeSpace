#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,p;
    cin >> n >> p;
    vector<pair<int,int>> costArray(n);
    for(int i=0;i<n;i++) cin>>costArray[i].first;
    for(int i=0;i<n;i++) cin>>costArray[i].second;
    sort(all(costArray), [](const pair<int,int>& x, const pair<int,int>& y){
        if (x.second == y.second) return x.first > y.first;
        return x.second < y.second;
    });
    int right = n-1;
    ll cost = p;
    int indx = 0;
    int a = costArray[indx].first;
    int b = costArray[indx].second;
    if(p<=b){
        cost = 1LL*n*p;
        cout<<cost<<endl;
        return;
    }
    while(right>0){
        if(a==0){
            indx++;
            if(indx>=n) break;
            a = costArray[indx].first;
            b = costArray[indx].second;
            if(p<=b)
                break;
        }
        cost += b;
        right--;
        a--;
    }
    cost += 1LL*right*p;
    cout<<cost<<endl;
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