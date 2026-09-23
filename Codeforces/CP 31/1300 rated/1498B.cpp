#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
bool check(vector<int>& bitCount){
    for(int i=0;i<30;i++){
        if(bitCount[i])
            return true;
    }
    return false;
}
void solve() {
    int n,W;
    cin>>n>>W;
    vector<int> bitCount(30);
    for(int i=0;i<n;i++){
        int temp = 0;
        cin>>temp;
        for(int j=0;j<30;j++){
            if(temp&(1<<j))
                bitCount[j]++;
        }
    }
    int height = 0;
    while(check(bitCount)){
        int W_lvl = W;
        height++;
        for(int i=29;i>=0;i--){
            while(W_lvl>=(1<<i)&&(bitCount[i])){
                bitCount[i]--;
                W_lvl -= (1<<i);
            }
        }
    }
    cout<<height<<endl;
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