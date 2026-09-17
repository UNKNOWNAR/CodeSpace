#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {//it can be proved in worst case maxm 32 addition gives the best results and maxm 32 times division makes a=0 for b=2 and a = 1e9
    ll a,b;
    cin>>a>>b;
    int ops = 0;
    if(b==1){    
        ops++;
        b++;
    }
    if(b>a){
        cout<<ops+1<<endl;
        return;
    }
    int ans = 1e9;
    for(int add=0;add<=31;add++){
        int max_multiply = 32;
        int temp_a = a;
        int temp_b = b+add;
        int temp_ops = 0;
        while(max_multiply--){
            if(temp_a==0)
                break;
            temp_a /= temp_b;
            temp_ops++;
        }
        ans = min(ops+temp_ops,ans);
        ops++;
    }
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