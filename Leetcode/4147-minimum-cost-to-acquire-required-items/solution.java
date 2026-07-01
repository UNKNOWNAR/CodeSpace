class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long need = Math.min(need1,need2);
        long cost = Math.min((long)cost1+cost2,costBoth);
        long minCost = need*cost;
        if(need1>need2)
            minCost += (long)(need1-need2)*Math.min(cost1,costBoth);
        else if(need1<need2)
            minCost += (long)(need2-need1)*Math.min(cost2,costBoth);
        return minCost;
    }
}
