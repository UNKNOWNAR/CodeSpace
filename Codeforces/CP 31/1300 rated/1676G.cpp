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
    vector<int> parent(n),color(n),indegree(n);
    parent[0] = -1;
    for(int i=1;i<n;i++){
        cin>>parent[i];
        parent[i]--;
        indegree[parent[i]]++;
    }
    string colorStr;
    cin>>colorStr;
    for(int i=0;i<n;i++)
        color[i] = (colorStr[i]=='B')?1:-1;
    int count = 0;
    queue<int> q;
    for(int i=0;i<n;i++){
        if(indegree[i]==0)
            q.push(i);
    }
    while(!q.empty()){
        int u = q.front();
        if(color[u]==0)
            count++;
        q.pop();
        if(parent[u] == -1) continue;
        color[parent[u]] += color[u];
        indegree[parent[u]]--;
        if(indegree[parent[u]]==0)
            q.push(parent[u]);
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