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
    int final_score = 0;
    for(int i=0;i<n;i++){
        int zeroCount = 0;
        for(int j=i;j<n;j++){
            if(arr[j]==0)
                zeroCount++;
            final_score += (j-i+1)+zeroCount;
        }
    }
    cout<<final_score<<endl;
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