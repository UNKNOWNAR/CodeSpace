class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int n = nums.length;
        int l = 0, r = n - 1;
        int leftOccurence = -1;
        int rightOccurence = -1;

        while(l <= r) {
            int mid = (l + r) / 2;
            if(nums[mid] < target) {
                l = mid + 1;
            } else if(nums[mid] > target) {
                r = mid - 1;
            } else {
                leftOccurence = mid;
                r = mid - 1;
            }
        }

        l = 0; r = n-1;

        while(l <= r) {
            int mid = (l + r) / 2;
            if(nums[mid] < target) {
                l = mid + 1;
            } else if(nums[mid] > target) {
                r = mid - 1;
            } else {
                rightOccurence = mid;
                l = mid + 1;
            }
        }
        result[0] = leftOccurence;
        result[1] = rightOccurence;
        
        return result;
    }
}

