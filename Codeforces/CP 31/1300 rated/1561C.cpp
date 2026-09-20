#include <bits/stdc++.h>
using namespace std;
#define fast_io ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL)
#define ll long long
#define pb push_back
#define all(v) v.begin(), v.end()
#define endl '\n'
bool check(ll x,vector<int>& nums){
    for(auto y:nums){
        if(x>y)
            x++;
        else
            return false;
    }
    return true;
}
void solve() {
    int n;
    cin>>n;
    vector<vector<ll>> arr(n);
    vector<pair<ll,int>> minPower;
    for(int i=0;i<n;i++){
        int k;
        cin>>k;
        ll min_power = 0;
        arr[i].resize(k);
        for(int j=0;j<k;j++){
            cin>>arr[i][j];
            min_power = max(min_power, arr[i][j]+1-j);
        }
        minPower.push_back({min_power, i});
    }
    sort(all(minPower));
    vector<int> nums;
    for(auto [min_power, i]: minPower){
        for(auto x: arr[i])
            nums.push_back(x);
    }
    ll low = *min_element(all(nums))+1;
    ll high = *max_element(all(nums))+1;
    while(low<=high){
       ll mid = low + ((high - low) >> 1);
        if(check(mid,nums))
            high = mid-1;
        else
            low = mid+1;
    }
    cout<<low<<endl;
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