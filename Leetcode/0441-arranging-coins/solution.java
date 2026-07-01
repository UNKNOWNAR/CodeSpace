class Solution {
    public int arrangeCoins(int n) {
        long low = 1;
        long high = n;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long coinsNeeded = mid * (mid + 1) / 2;
            
            if (coinsNeeded == n) {
                return (int) mid;
            } else if (coinsNeeded < n) {
                // We have enough coins, try to build more rows
                low = mid + 1;
            } else {
                // Not enough coins, need fewer rows
                high = mid - 1;
            }
        }
        
        // When low > high, 'high' will point to the largest number 
        // of rows that required <= n coins.
        return (int) high;
    }
}
