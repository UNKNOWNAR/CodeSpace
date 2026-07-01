class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            

        }
        int ans = binarySearch(nums , threshold, max);
            return ans;

    }

    public int binarySearch(int nums[], int threshold, int max) {
        int low = 1;
        int high = max;
        int ans = max;
        
        while (low <= high) {
            int sum = 0;
            int mid = (high + low) / 2;
            for (int i = 0; i < nums.length; i++) {
                sum += (nums[i] + mid - 1) / mid;

            }
            if (sum <= threshold) {
               ans = mid;
               high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return ans;

    
    }
}
