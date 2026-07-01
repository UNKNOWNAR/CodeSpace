class Solution {
    public int maxProfit(int[] prices,int fee) {
        int prevBuy = 0,currBuy,currSell;
        int prevSell = prices[prices.length-1]-fee;
        for(int indx=prices.length-2;indx>=0;indx--){
            currBuy = Math.max(prevSell-prices[indx],prevBuy);
            currSell = Math.max(prevBuy+prices[indx]-fee,prevSell); 
            prevBuy = currBuy;
            prevSell = currSell;
        }
        return prevBuy;
    }
}
