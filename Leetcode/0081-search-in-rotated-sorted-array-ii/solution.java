class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevent overflow
            
            if (nums[mid] == target) return true;

            // 1. Handle Duplicates (The ambiguity case)
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue;
            }

            // 2. Identify which side is sorted
            if (nums[low] <= nums[mid]) { 
                // Left half is sorted
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // Target is inside the sorted left half
                } else {
                    low = mid + 1;  // Target must be in the right half
                }
            } else { 
                // Right half is sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;  // Target is inside the sorted right half
                } else {
                    high = mid - 1; // Target must be in the left half
                }
            }
        }
        return false;
    }
}
