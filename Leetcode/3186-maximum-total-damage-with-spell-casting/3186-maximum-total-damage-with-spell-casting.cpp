class Solution {
    using ll = long long;
public:
    unordered_map<ll,ll> freq;
    ll maximumTotalDamage(vector<int>& power) {
        sort(power.begin(),power.end());
        for(int p:power)
            freq[p]++;
        vector<ll> dp(power.size(),-1);
        return solve(0,power,dp);
    }
    ll solve(int indx,vector<int>& power,vector<ll>& dp){
        if(indx==power.size())
            return 0;
        if(dp[indx]!=-1)
            return dp[indx];
        //take
        int next = upper_bound(power.begin(),power.end(),power[indx]+2)-power.begin();
        ll damage = 1LL*freq[power[indx]]*power[indx]+solve(next,power,dp);
        //not take
        next = upper_bound(power.begin(),power.end(),power[indx])-power.begin();
        damage = max(damage,solve(next,power,dp));
        return dp[indx] = damage;
    }
};