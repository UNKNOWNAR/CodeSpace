class Solution {
    using ll = long long;
public:
    bool check(ll initial_strength,vector<int>& monsters, vector<ll>& prefixSum){
        ll boost = 0;
        for(int i=0;i<monsters.size();i++){
            boost += prefixSum[i];
            if(initial_strength+boost>=monsters[i])
                initial_strength = max(1LL-1LL,initial_strength-monsters[i]);
            else
                return false;
        }
        return true;
    }
    ll minInitialStrength(vector<int>& monsters, vector<vector<int>>& boosts) {
        vector<ll> prefixSum(monsters.size());
        for(int i=0;i<boosts.size();i++){
            int l = boosts[i][0];
            int r = boosts[i][1];
            int v = boosts[i][2];
            prefixSum[l] += v;
            if(r!=monsters.size()-1)
                prefixSum[r+1] -= v;
        }
        ll low = 0,high = 0;
        for(auto monster:monsters)
            high += monster;
        while(low<=high){
            ll mid = low+(high-low)/2;
            if(check(mid,monsters,prefixSum))
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
};