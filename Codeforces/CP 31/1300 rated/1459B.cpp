#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
struct info{
    int x;
    int y;
    int prev;
};
//0 - north
//1 - south
//2 - east
//3 - west
int dr[4] = {1,-1,0,0};
int dc[4] = {0,0,1,-1};
void solve() {
    int n;
    cin>>n;
    queue<info> q;
    q.push({0,0,-1});
    int ans = 0;
    for(int j=0;j<n;j++){
        int siz = q.size();
        set<pair<int,int>> newStates;
        while(siz--){
            auto [x,y,prev]=q.front();
            q.pop();
            if(j&1){
                if(prev==0||prev==1){
                    for(int i=2;i<4;i++){
                        int nx=x+dr[i];
                        int ny=y+dc[i];
                        newStates.insert({nx,ny});
                        q.push({nx,ny,i});
                    }
                }   
                else{
                    for(int i=0;i<2;i++){
                        int nx=x+dr[i];
                        int ny=y+dc[i];
                        newStates.insert({nx,ny});
                        q.push({nx,ny,i});
                    }
                }
            }
            else{
                for(int i=0;i<4;i++){
                    int nx=x+dr[i];
                    int ny=y+dc[i];
                    newStates.insert({nx,ny});
                    q.push({nx,ny,i});
                }
            }
        }     
        ans = newStates.size();
    }
    cout<<ans<<endl;
}

int main() {
    fast_io; 
    int t=1;
    while (t--) {
        solve();
    }
    return 0;
}