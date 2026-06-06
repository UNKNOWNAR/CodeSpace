#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
bool compareGems(const pair<int, int>& a, const pair<int, int>& b) {
    return a.second > b.second;
}
void solve() {
    int n,k,m;
    cin>>n>>k>>m;
    vector<pair<int,int>> gems(n);
    for(int i=0;i<n;i++){
        cin>>gems[i].first;
        cin>>gems[i].second;
    }
    sort(all(gems),compareGems);
    ll value = 0;
    set<int> isPresent;
    for(int i=0;i<n;i++){
        if(!isPresent.contains(gems[i].first)){
            value += gems[i].second;
            m--;
            k--;
            isPresent.insert(gems[i].first);
            gems[i].second = 0;
        }
        if(m==0)
            break;
    }
    for(int i=0;i<n;i++){
        if(k>0&&gems[i].second!=0){
            value += gems[i].second;
            k--;
        }
    }
    cout<<value<<endl;
}
int main() {
    fast_io; 
    solve();
    return 0;
}