class Solution {
    using ll = long long;
public:
    long long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        ll ans = 0;
        if(costBoth>=cost1+cost2)
            return 1LL*need1*cost1+1LL*need2*cost2;
        int both = min(need1,need2);
        ans = 1LL*both*costBoth;
        if(need1>both)
            ans += 1LL*(need1-both)*min(cost1,costBoth);
        else
            ans += 1LL*(need2-both)*min(cost2,costBoth);
        return ans;
    }
};