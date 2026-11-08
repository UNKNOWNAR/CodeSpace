#include<bits/stdc++.h>
using namespace std;
#define fastIO() ios_base::sync_with_stdio(false);cin.tie(NULL)
#define int long long
#define nl cout<<'\n'
#define sp ' '
#define vi vector<int>
#define vvi vector<vector<int>>
#define pii pair<int,int>
#define pb push_back
#define all(v) v.begin(),v.end()
#define sz(x) ((int)(x).size())
#define F first
#define S second
#define no cout<<"NO"
#define yes cout<<"YES"
#define inf LLONG_MAX
int mod = 1e9+7;
void solve(){
    int n,m;
    string p,q;
    cin>>n>>m>>p>>q;
    vector<int> freqN(26),freqD(26);
    for(auto c:p)
        freqN[c-'a']++;
    for(auto c:q)
        freqD[c-'a']++;
    for(int i=0;i<26;i++)
        freqN[i] -= freqD[i];
    for(int i=0;i<26;i++){
        if(freqN[i]<0){
            cout<<"NO";
            return;
        }
        char temp = (char)('a'+i);
        if(temp=='s'||temp=='i'||temp=='x'){
            if(freqN[i]>1){
                cout<<"NO";
                return;
            }
        }
        else if(freqN[i]>0){
            cout<<"NO";
            return;
        }
    }
    if(freqN['s'-'a']==1&&freqN['i'-'a']==1&&freqN['x'-'a'])
        cout<<"YES";
    else
        cout<<"NO";
}

signed main(){
    fastIO();
    int tt=1;
    cin>>tt;
    while(tt--) {
        solve();
        nl;
    }
    return 0;
}