#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
void solve() {
    int n,q;
    cin>>n>>q;
    vector<int> arr(n);
    vector<int> first_occurence(51);
    for(int i=0;i<n;i++){
        cin>>arr[i];
        if(first_occurence[arr[i]]==0)
            first_occurence[arr[i]] = i+1;
    }
    for(int i=0;i<q;i++){
        int temp = 0;
        cin>>temp;
        int current_pos = first_occurence[temp];
        cout<<first_occurence[temp]<<" ";
        for(int j=1;j<=50;j++){
            if((first_occurence[j]!=0&&first_occurence[j] < current_pos))
                first_occurence[j]++;
        }
        first_occurence[temp] = 1;
    }
    cout<<endl;
}

int main() {
    fast_io; 
    int t=1; 
    while (t--) {
        solve();
    }
    return 0;
}