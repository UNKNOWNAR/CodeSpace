class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 0;
        int left = 0;

        for (int right = 0; right < prices.length; right++) {
            // If we are not at the start AND the descent is broken
            if (right > 0 && prices[right - 1] - prices[right] != 1) {
                left = right; // Reset the window to start at the current element
            }
            
            // Add the length of the current valid window to the answer
            // This is equivalent to saying: "How many valid subarrays end at index 'right'?"
            ans += (right - left + 1);
        }
        
        return ans;
    }
}
