class Solution {
    int dp[][];
    public int coinChange(int[] coins, int amount) {
        int dp[] = new int[amount+1];
        for(int amt=1;amt<=amount;amt++){
            if(amt%coins[0]==0)
                dp[amt] = amt/coins[0];
            else
                dp[amt] = (int)1e9;
        }
        for(int indx=1;indx<coins.length;indx++){
            int curr[] = new int[amount+1];
            for(int amt =0;amt<=amount;amt++){
                int take = (int)1e9;
                if(coins[indx]<=amt)
                    take = 1+curr[amt-coins[indx]];
                curr[amt]=Math.min(dp[amt],take);
            }
            dp=curr;
        }
        if(dp[amount]<(int)1e9)
            return dp[amount];
        return -1;
    }
}
