import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> index = new HashMap<>();
        long sum = 0, ans = 0;
        int start = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (index.containsKey(num)) {
                // Slide start to one past the last seen duplicate
                int dupIndex = index.get(num);
                while (start <= dupIndex) {
                    sum -= nums[start];
                    index.remove(nums[start]);
                    start++;
                }
            }

            sum += num;
            index.put(num, i);

            if (i - start + 1 == k) {
                ans = Math.max(ans, sum);

                // Slide the window
                index.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
        }

        return ans;
    }
}

