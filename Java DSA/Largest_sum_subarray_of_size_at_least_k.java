/*Largest sum subarray of size at least k

Input : arr[] = {-4, -2, 1, -3}, k = 2
Output : -1
Explanation : The sub array is {-2, 1}.

Input : arr[] = {1, 1, 1, 1, 1, 1} , k = 2
Output : 6
Explanation : The sub array is {1, 1, 1, 1, 1, 1} */
public class Largest_sum_subarray_of_size_at_least_k {
    // Java program to find largest subarray sum with
// at-least k elements in it.
    static int maxSumWithK(int[] arr, int k) {

        // Calculate initial sum of
        // first k elements (first window)
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int last = 0;
        int j = 0;
        int ans = Integer.MIN_VALUE;
        ans = Math.max(ans, sum);

        // Process rest of the array after first k elements
        for (int i = k; i < arr.length; i++) {

            // Add current element to window sum
            sum = sum + arr[i];

            // Add element at j to 'last' and increment j
            last = last + arr[j++];

            // Update answer if current window sum is greater
            ans = Math.max(ans, sum);

            // If sum of elements before window becomes negative
            if (last < 0) {
                sum = sum - last;
                ans = Math.max(ans, sum);
                last = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1};
        int k = 2;
        System.out.println(maxSumWithK(arr, k));
    }
}
