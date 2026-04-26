package LeetCode.contset.Weekly_Contest466;

import java.util.*;
import java.io.*;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 07-09-2025
 */
public class minmOperation {

    // ===================================================================
    // THIS IS THE PART YOU WILL COPY AND PASTE INTO LEETCODE
    // ===================================================================

    /**
     * This is an example method signature.
     * Replace this with the actual method signature from the LeetCode problem.
     */
    public int minOperations(String s) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 26; i++)
            list.add(new ArrayList<>());
        char[] arr = s.toCharArray();
        int acounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a')
                acounter++;
            list.get((arr[i]) - 'a').add(i);
        }
        if (acounter == arr.length)
            return 0;
        int ans = 0;
        for (int i = 1; i < 26; i++) {
            if(!list.get(i).isEmpty()) {
                list.get((i + 1) % 26).addAll(list.get(i));
                ans++;
            }
        }
        return ans;
    }
    // ===================================================================
    // END OF THE PART YOU WILL SUBMIT
    // ===================================================================


    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        minmOperation obj = new minmOperation();

        // 2. Create the sample input(s)
        // Example: int[] nums = {2, 7, 11, 15};

        // 3. Call your method
        // Example: int result = solution.exampleMethod(nums);

        // 4. Print the result to check if it's correct
        // Example: System.out.println("Output: " + result);
    }
}