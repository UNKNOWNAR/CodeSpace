class Solution {
    using ll = long long;
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, ll success) {
        sort(potions.begin(),potions.end());
        int n = potions.size();
        vector<int> ans;
        for(ll spell:spells){
            ll min_potion = (success+spell-1)/spell;
            int indx = lower_bound(potions.begin(),potions.end(),min_potion)-potions.begin();
            ans.push_back(n-indx);
        }
        return ans;
    }
};