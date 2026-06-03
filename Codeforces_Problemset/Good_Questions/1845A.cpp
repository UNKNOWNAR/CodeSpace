#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,k,x;
    cin>>n>>k>>x;
    if(x!=1){//i can easily make any number using one
        cout<<"Yes"<<endl;
        cout<<n<<endl;
        for(int i=0;i<n;i++)
            cout<<1<<" ";
        cout<<endl;
        return;
    }
    if(k==1){//k=1 means x=1 so no number is avialiable to make n 
        cout<<"No"<<endl;
        return;
    }
    if(n%2==0){//n is even and k >=2 i can use 2 to make any even number
        cout<<"Yes"<<endl;
        cout<<n/2<<endl;
        for(int i=0;i<n/2;i++)
            cout<<2<<" ";
        cout<<endl;
        return;
    }
    else{
        if(k==2){//n is odd and k=2 means i only have 2 to make odd numbers which is impossible
            cout<<"No"<<endl;
            return;
        }
        else{//n is odd and k>=3 i can use 3 to make number (n-3) which is even and add make the rest using 2 
            cout<<"Yes"<<endl;
            cout<<(n-3)/2+1<<endl;
            cout<<3<<" ";
            for(int i=0;i<(n-3)/2;i++)
                cout<<2<<" ";
            cout<<endl;
            return;
        }
    }
    
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