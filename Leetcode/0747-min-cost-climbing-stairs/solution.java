class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev2 = 0;
        int prev = 0;
        for(int i=2;i<=cost.length;i++){
            int curr = Math.min(prev + cost[i - 1], prev2 + cost[i - 2]);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
