class Solution {
    public int maxProfit(int[] prices) {
        int p1=prices[0],maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(p1>prices[i])
                p1=prices[i];
            else if(prices[i] - p1>maxProfit)
                maxProfit = prices[i]-p1;
        }
        return maxProfit;
    }
}
