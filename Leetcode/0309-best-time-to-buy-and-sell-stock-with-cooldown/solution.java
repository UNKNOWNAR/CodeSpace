class Solution {
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length+1][2];
        dp[prices.length-1][1] = 0;
        dp[prices.length-1][0] = prices[prices.length-1];
        for(int indx=prices.length-2;indx>=0;indx--){
                dp[indx][1] = Math.max(dp[indx+1][0]-prices[indx],dp[indx+1][1]);
                dp[indx][0] = Math.max(dp[indx+2][1]+prices[indx],dp[indx+1][0]); 
        }
        return dp[0][1];
    }
}
