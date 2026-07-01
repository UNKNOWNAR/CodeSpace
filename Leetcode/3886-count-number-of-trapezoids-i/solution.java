class Solution {
    public int countTrapezoids(int[][] points) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        Map<Integer, Integer> counts = new HashMap<>();
        for (int[] p : points) 
            counts.put(p[1], counts.getOrDefault(p[1], 0) + 1);
        long MOD = 1_000_000_007L;
        long totalTrapezoids = 0;
        long sumOfWaysSoFar = 0;
        for(int count:counts.values()){
            if(count<2)
                continue;
            long n = (long) count;
            long currentWays = (n * (n - 1) / 2) % MOD;
            long newTrapezoids = (currentWays * sumOfWaysSoFar) % MOD;
            totalTrapezoids = (totalTrapezoids + newTrapezoids) % MOD;
            sumOfWaysSoFar = (sumOfWaysSoFar + currentWays) % MOD;
        }
        return (int)totalTrapezoids;
    }
}
