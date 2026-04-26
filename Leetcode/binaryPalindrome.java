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
public class binaryPalindrome {

    // ===================================================================
    // THIS IS THE PART YOU WILL COPY AND PASTE INTO LEETCODE
    // ===================================================================

    /**
     * This is an example method signature.
     * Replace this with the actual method signature from the LeetCode problem.
     */
    public int countBinaryPalindromes(long n) {
        if(n==0) return 1;
        int count = 1;
        long k = 1;
        while(true){
            StringBuilder binary = BinaryEqv(k);
            StringBuilder evenPalindrome = binary.append(binary.reverse());
            if(IntegerEqv(evenPalindrome)<=n)
                count++;
            else
                break;
            StringBuilder oddPalindrome = binary.append(new StringBuilder(binary.substring(0,binary.length()-1)).reverse());
            if(IntegerEqv(oddPalindrome)<=n)
                count++;
        }
        return count+1;
    }
    private StringBuilder BinaryEqv(long n){
        StringBuilder binary = new StringBuilder();
        long temp = 0;
        while(temp>1){
            binary.insert(0,String.valueOf(temp%2));
            temp /=2;
        }
        binary.insert(0,String.valueOf(temp));
        return binary;
    }
    private long IntegerEqv(StringBuilder binary){
        int indx = 0;
        long integer = 0;
        while(!binary.isEmpty()){
            if(binary.charAt(binary.length()-1)=='1')
                integer += Math.pow(2,indx);
            indx++;
        }
        return integer;
    }
    // ===================================================================
    // END OF THE PART YOU WILL SUBMIT
    // ===================================================================


    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        binaryPalindrome obj = new binaryPalindrome();
        obj.countBinaryPalindromes(9);
        // 2. Create the sample input(s)
        // Example: int[] nums = {2, 7, 11, 15};

        // 3. Call your method
        // Example: int result = solution.exampleMethod(nums);

        // 4. Print the result to check if it's correct
        // Example: System.out.println("Output: " + result);
    }
}