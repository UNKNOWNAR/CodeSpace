class Solution {
    public int minCost(int n, int[] cuts) {
        List<Integer> cutsList = new ArrayList<>();
        for (int cut : cuts) {
            cutsList.add(cut);
        }
        cutsList.add(0);
        cutsList.add(n);
        Collections.sort(cutsList);
        
        int c = cutsList.size();
        int[][] dp = new int[c][c];

        for (int i = c - 2; i >= 0; i--) {
            for (int j = i + 1; j < c; j++) {
                
                int minCost = Integer.MAX_VALUE;
                
                for (int k = i + 1; k < j; k++) {
                    int cost = (cutsList.get(j) - cutsList.get(i)) 
                             + dp[i][k] 
                             + dp[k][j];
                    
                    minCost = Math.min(minCost, cost);
                }
                
                dp[i][j] = (minCost == Integer.MAX_VALUE) ? 0 : minCost;
            }
        }

        return dp[0][c - 1];
    }
}
