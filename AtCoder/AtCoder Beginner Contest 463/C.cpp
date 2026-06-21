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
    struct Compare {
        bool operator()(const pair<int, int>& a, const pair<int, int>& b) {
            if (a.first != b.first) 
                return a.first < b.first; 
            return a.second > b.second; 
        }
    };
    priority_queue<pair<int,int>, vector<pair<int,int>>, Compare> arr;
    for(int i=0;i<n;i++) {
        int u, v;
        cin>>u>>v;
        arr.push({u, v});
    }
    int q;
    cin>>q;
    vector<pair<int,int>> querry(q);
    vector<int> answer(q);
    for(int i=0;i<q;i++){
        cin>>querry[i].first;
        querry[i].second=i;
    }
    sort(all(querry));
    for(int i=0;i<q;i++){
        int time = arr.top().second;
        answer[querry[i].second] = arr.top().first;
        while(time<=querry[i].first){
            arr.pop();
            time = arr.top().second;
            answer[querry[i].second] = arr.top().first;
        }
    }
    for(int i=0;i<q;i++)
        cout<<answer[i]<<endl;
    
}
int main() {
    fast_io; 
    int t=1;
    while (t--) {
        solve();
    }
    return 0;
}