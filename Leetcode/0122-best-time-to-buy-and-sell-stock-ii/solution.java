class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        int price = prices[0];

        for(int i=1; i<prices.length; i++) {
            int profit = prices[i] - price;
            if(profit > 0) {
                total += profit;
                price = Integer.MAX_VALUE;
            }

            if(prices[i] < price) {
                price = prices[i];
            }
        }

        return total;
    }
}
