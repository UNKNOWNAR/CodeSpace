import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicIncreasingStack {
    // Function to implement monotonic increasing stack
    public int[] monotonicIncreasing(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();

        // Traverse the array
        for (int num : nums) {
            // While stack is not empty AND top of stack is more than the current element
            while (!stack.isEmpty() && stack.peekLast() > num) {
                // Pop the top element from the stack
                stack.pollLast();
            }
            // Push the current element into the stack
            stack.offerLast(num);
        }

        // Construct the result array from the stack
        int[] result = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            result[index--] = stack.pollLast();
        }

        return result;
    }

    // Main method for example usage
    public static void main(String[] args) {
        // Example usage:
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] result = (nums);
        System.out.print("Monotonic increasing stack: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
/*Complexity Analysis:

Time Complexity: O(N), each element from the input array is pushed and popped from the stack exactly once. Therefore, even though there is a loop inside a loop, no element is processed more than twice.
Auxiliary Space: O(N)*/