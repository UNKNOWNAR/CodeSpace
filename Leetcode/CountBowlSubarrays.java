package LeetCode.contset.Weekly_Contest466;

import java.util.*;
import java.io.*;

/**
 * Solution for: Count Bowl Subarrays
 * Problem: 3676
 * LeetCode Link: https://leetcode.com/problems/count-bowl-subarrays/
 *
 * @author UnknownAR
 * @date 07-09-2025
 */
public class CountBowlSubarrays {

    // ===================================================================
    // THIS IS THE PART YOU WILL COPY AND PASTE INTO LEETCODE
    // ===================================================================

    /**
     * This is an example method signature.
     * Replace this with the actual method signature from the LeetCode problem.
     */
    long dp[][];
    public long bowlSubarrays(int[] nums) {
        dp = new long[nums.length][nums.length];
        for(long rows[]:dp)
            Arrays.fill(rows,-1);
        return count(0,2,nums);
    }
    private long count(int indx1,int indx2,int[] nums){
        if(indx2==nums.length)
            return 0;
        if(dp[indx1][indx2]!=-1)
            return 0;
        int maxm = 0;
        for(int i=indx1+1;i<indx2;i++)
            maxm = Math.max(maxm,nums[i]);
        if(Math.min(nums[indx1],nums[indx2])>maxm)
            return dp[indx1][indx2] = 1+ count(indx1+1,indx2+1,nums)+count(indx1,indx2+1,nums);
        return dp[indx1][indx2] = count(indx1+1,indx2+1,nums)+count(indx1,indx2+1,nums);

    }
    // END OF THE PART YOU WILL SUBMIT
    // ===================================================================


    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        CountBowlSubarrays obj = new CountBowlSubarrays();
        int arr[] = {5,1,2,3,4};
        System.out.println(obj.bowlSubarrays(arr));
        // 2. Create the sample input(s)
        // Example: int[] nums = {2, 7, 11, 15};

        // 3. Call your method
        // Example: int result = solution.exampleMethod(nums);

        // 4. Print the result to check if it's correct
        // Example: System.out.println("Output: " + result);
    }
}