class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long maxSum = Long.MIN_VALUE;
        long currentPrefixSum = 0;

        // Stores the minimum prefix sum found for each remainder value (0 to k-1)
        long[] minPrefixSum = new long[k];
        
        // Initialize with Infinity to ensure we only pick valid previous positions
        Arrays.fill(minPrefixSum, Long.MAX_VALUE);
        
        // Base case: A prefix sum of 0 exists at "index -1" (length 0), 
        // which conceptually has a remainder of 0 relative to any k.
        // Note: We use length % k as the index.
        minPrefixSum[0] = 0;

        for (int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i];

            // Calculate current length's remainder (1-based length)
            int remainder = (i + 1) % k;

            // If we have seen this remainder before, we can form a valid subarray
            if (minPrefixSum[remainder] != Long.MAX_VALUE) {
                long subarraySum = currentPrefixSum - minPrefixSum[remainder];
                maxSum = Math.max(maxSum, subarraySum);
            }

            // Update the minimum prefix sum for this remainder
            minPrefixSum[remainder] = Math.min(minPrefixSum[remainder], currentPrefixSum);
        }

        return maxSum == Long.MIN_VALUE ? -1 : maxSum; 
    }
}
