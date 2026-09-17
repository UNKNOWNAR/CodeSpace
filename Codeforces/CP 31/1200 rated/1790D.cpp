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
    set<int> uniq;
    map<int,int> freq;
    int count = 0;
    for(int i=0;i<n;i++){
        int a;
        cin>>a;
        freq[a]++;
        uniq.insert(a);
    }
    for(auto &x:uniq){
        while(freq[x]>0){
            int temp = x;
            while(freq[temp]>0){
                freq[temp]--;
                temp++;
            }
            count++;
        }
    }
    cout<<count<<endl;
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