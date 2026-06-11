#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k;
    cin>>n>>k;
    if(k<=n){
        cout<<k<<endl;
        return;
    }
    vector<int> player_strength(n + 1, 0);  
    for(int i=0;i<k; i++) {
        int rem = i % (2 * n);
        int player = (rem < n) ? (rem + 1) : (2 * n - rem);
        player_strength[player] += (k - i);
    }
    int max_deck = 0;
    for(int i=1;i<=n; i++) 
        max_deck = max(max_deck, player_strength[i]);
    cout << max_deck << endl;    
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