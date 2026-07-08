#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,m;
    cin>>n>>m;
    map<int,int> freq;
    for(int i=0;i<n;i++){
        int temp = 0;
        cin>>temp;
        freq[temp%m]++;
    }
    int grps = 0;
    for(int i=0;i<m;i++){
        int x = freq[i];
        int y = freq[(m-i)%m];
        if((x==0)&&(y==0))
            continue;
        int temp = min(x,y);
        x -= min(temp+1,x);
        y -= min(temp+1,y);
        grps++;
        grps += x+y;
        freq[i] = 0;
        freq[(m-i)%m] = 0;
    }
    cout<<grps<<endl;
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