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
    int count1=0;
    int count_neg1=0;
    for(int i=0;i<n;i++){
        int num;
        cin>>num;
        if(num==1)
            count1++;
        else
            count_neg1++;    
    }
    int ops = 0;
    while(count1<count_neg1||count_neg1%2!=0){
        count_neg1--;
        count1++;
        ops++;
    }
    cout<<ops<<endl;
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