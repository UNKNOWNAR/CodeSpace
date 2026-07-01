class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderIndex = new HashMap<>();
        remainderIndex.put(0, -1); // Handles subarray starting at index 0

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int remainder = k == 0 ? sum : sum % k;

            if (remainderIndex.containsKey(remainder)) {
                if (i - remainderIndex.get(remainder) >= 2) {
                    return true;
                }
            } else {
                remainderIndex.put(remainder, i);
            }
        }

        return false;
    }
}

