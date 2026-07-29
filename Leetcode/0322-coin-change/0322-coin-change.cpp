class Solution {
public:
    int INF = 1e9;
    int coinChange(vector<int>& coins, int amount) {
        vector<vector<int>> dp(coins.size(), vector<int>(amount + 1, -1));
        int ans = countCoins(0, amount, coins, dp);
        return ans >= INF ? -1 : ans;
    }
    int countCoins(int indx, int amount, vector<int>& coins, vector<vector<int>>& dp) {
        if (amount == 0)
            return 0;
        if (indx == coins.size())
            return INF;
        if (dp[indx][amount] != -1)
            return dp[indx][amount];
        int count = countCoins(indx + 1, amount, coins, dp);
        int it = 1;
        while (amount - it * coins[indx] >= 0) {
            int temp = countCoins(indx + 1, amount - it * coins[indx], coins, dp);
            if (temp != INF) {
                count = min(count, temp + it);
            }
            it++;
        }
        return dp[indx][amount] = count;
    }
};