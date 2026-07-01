class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            long target = (long)nums[i] * k;
            int j = findUpperBound(nums, target);
            maxLen = Math.max(maxLen, j - i);
        }
        return n - maxLen;
    }

    private int findUpperBound(int[] nums, long target) {
        int low = 0, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}
