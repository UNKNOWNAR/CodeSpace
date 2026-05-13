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
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[i];
    if(n<3){
        cout<<"YES"<<endl;
        return;
    }
    unordered_map<int,int> freq;
    for(int i=0;i<n;i++) freq[arr[i]]++;
    if(freq.size()>2){
        cout<<"NO"<<endl;
        return;
    }
    if(freq.size()==1){
        cout<<"YES"<<endl;
        return;
    }
    int count[2];
    int indx=0;
    for(auto &i:freq){
        count[indx++]=i.second;
    }
    if(count[0]==count[1]||count[0]==count[1]+1||count[1]==count[0]+1){
        cout<<"YES"<<endl;
        return;
    }
    cout<<"NO"<<endl;
}

int main() {
    fast_io; 
    int t = 1;
    cin >> t; 
    while (t--) {
        solve();
    }
    return 0;
}