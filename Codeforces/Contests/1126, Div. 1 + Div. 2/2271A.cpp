    #include <bits/stdc++.h>
    using namespace std;
    #define fastIO() ios_base::sync_with_stdio(false);cin.tie(NULL)
    #define int long long
    #define nl cout<<'\n'
    #define pii pair<int,int>
    void solve() {
        int a, b;
        cin >> a >> b;
        if(a+1>=b){
            if(abs(a-b)&1)
                cout<<a+1;
            else 
                cout<<a;
        }
        else
            cout<<-1;
    }
    signed main() {
        fastIO();
        int tt = 1;
        cin >> tt;
        while (tt--) {
            solve();
            nl;
        }
        return 0;
    }