import java.util.*;
public class Two_Sum {
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
    to target.You may assume that each input would have exactly one solution, and you may not use the same element
    twice. You can return the answer in any order. */
    int[] twoSum(int[] nums, int target)//O(n^2) is time complexity
    {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] + nums[j]) == target)
                    return new int[]{i, j};
            }
        }
        System.out.println("Such Combination doesn't exist");
        return null;
    }
    public int[] two_Sum(int[] nums, int target)//O(n) is time complexity
    {
        // HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate complement (what number, when added to nums[i], gives the target)
            int complement = target - nums[i];
            // If complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }
        // Throw exception if no solution is found (though problem guarantees one solution)
        throw new IllegalArgumentException("No two sum solution");
    }
    public int[] TwoSum(int[] nums, int target) {//O(nlogn) is time complexity
        // Create an array to store both the numbers and their original indices
        int[][] numWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numWithIndex[i][0] = nums[i];  // store the number
            numWithIndex[i][1] = i;        // store its original index
        }
        // Sort the array based on the numbers (the first element in each sub-array)
        Arrays.sort(numWithIndex, (a, b) -> Integer.compare(a[0], b[0]));
        // Two-pointer approach
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = numWithIndex[left][0] + numWithIndex[right][0];
            if (sum == target) {
                // Return the original indices of the two numbers
                return new int[]{numWithIndex[left][1], numWithIndex[right][1]};
            } else if (sum < target) {
                // If the sum is less than the target, move the left pointer to the right
                left++;
            } else {
                // If the sum is greater than the target, move the right pointer to the left
                right--;
            }
        }
        // Throw exception if no solution is found (though the problem guarantees one solution)
        throw new IllegalArgumentException("No two sum solution");
    }
}