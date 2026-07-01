class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        List<Integer> lis = new ArrayList<>();
        lis.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > lis.get(lis.size() - 1)) {
                // If nums[i] is greater than the last element, extend LIS
                lis.add(nums[i]);
            } else {
                // Otherwise, find the position to replace using binary search
                int start = 0, end = lis.size() - 1;
                while (start < end) {
                    int mid = (start + end) / 2;
                    if (lis.get(mid) < nums[i]) {
                        start = mid + 1;
                    } else {
                        end = mid;
                    }
                }
                lis.set(start, nums[i]); // Replace the element
            }
        }
        return lis.size();
    }
}

