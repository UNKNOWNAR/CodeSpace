#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,x;
    cin>>n>>x;
    vector<int> a(n);
    vector<int> b(n);
    vector<int> c(n);
    for(int i=0;i<n;i++)    cin>>a[i];
    for(int i=0;i<n;i++)    cin>>b[i];
    for(int i=0;i<n;i++)    cin>>c[i];
int current_or = 0;
    for(int i=0; i<n; i++){    
        if ((a[i] | x) == x) {
            current_or |= a[i];
        } else {
            break;
        }
    }
    for(int i=0; i<n; i++){    
        if ((b[i] | x) == x) {
            current_or |= b[i];
        } else {
            break; 
        }
    }
    for(int i=0; i<n; i++){    
        if ((c[i] | x) == x) {
            current_or |= c[i];
        } else {
            break;
        }
    }
    if (current_or == x) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
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