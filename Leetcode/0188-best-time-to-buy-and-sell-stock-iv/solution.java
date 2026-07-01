class Solution {
    public int maxProfit(int k, int[] prices) {
        int prev[][] = new int[2][k+1];
        int curr[][] = new int[2][k+1];
        for(int tradesLeft=1;tradesLeft<=k;tradesLeft++)
            prev[0][tradesLeft] = prices[prices.length-1];
        for(int indx=prices.length-2;indx>=0;indx--){
            for(int tradesLeft=1;tradesLeft<=k;tradesLeft++){
                curr[0][tradesLeft] = Math.max(prev[1][tradesLeft-1]+prices[indx],prev[0][tradesLeft]);
                curr[1][tradesLeft] = Math.max(prev[0][tradesLeft]-prices[indx],prev[1][tradesLeft]);
            }
            prev = curr;
        }
        return prev[1][k];
    }    
}
