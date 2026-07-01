class Solution {
    Long dp[][][];
    public long maximumProfit(int[] prices, int k) {
        dp = new Long[prices.length][3][k+1];

        return transaction(0,0,k,prices);
    }
//State 0 (Neutral): You have nothing,State 1 (Long): You own stock,State 2 (Short): You "owe" stock (Sold short)
    public long transaction(int indx,int CurrentState,int k,int prices[]){
        if (indx == prices.length) {
            // If we end while Neutral (0), return 0.
            // If we end holding/owing stock (1 or 2), return penalty (-infinity).
            return (CurrentState == 0) ? 0 : -1000000000;
        }
        // BASE CASE 2: No profits left (But allow closing existing ones)
        if (k == 0 && CurrentState == 0) {
            return 0;
        }
        if (dp[indx][CurrentState][k] != null) return dp[indx][CurrentState][k];
        long profit=0;
        if(CurrentState==0){//Neutral
            profit = transaction(indx+1,0,k,prices);//move to the next
            profit = Math.max(profit,-prices[indx]+transaction(indx+1,1,k,prices));//buy stock
            profit = Math.max(profit,prices[indx]+transaction(indx+1,2,k,prices));//Short the stock
            return dp[indx][CurrentState][k] = profit;
        }
        if(CurrentState==1){//Dont have a stock on me
            profit = transaction(indx+1,CurrentState,k,prices);//move to the next
            profit = Math.max(profit,prices[indx]+transaction(indx+1,0,k-1,prices));//buy stock
            return dp[indx][CurrentState][k] = profit;
        }
        //Have stock on me

        profit = transaction(indx+1,CurrentState,k,prices);
        profit = Math.max(profit,-prices[indx]+transaction(indx+1,0,k-1,prices));//Sell the stock

        return dp[indx][CurrentState][k] = profit;   
    }
}
