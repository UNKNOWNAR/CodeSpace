#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {//n is the maxm value of f using the formula with subsequence size being one and f min being the whole array as subsequence and it can be proved fmin to fmax every f can be formed by just removing the element with highest frequency from the array so g(B1)+g(B2)-1<g(B1+B2)
    int n;
    cin>>n;
    int temp = n;
    map<int,int> freq;
    int highest=0;
    while(temp--){
        int temp;
        cin>>temp;
        freq[temp]++;
        highest = max(highest,freq[temp]);
    }
    cout<<n-highest+1<<endl;
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