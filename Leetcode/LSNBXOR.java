package LeetCode.contset.Weekly_Contest470;

import java.util.*;
import java.io.*;

/**
 * Solution for:3702
 * Problem:Longest Subsequence With Non-Zero Bitwise XOR
 * LeetCode Link: https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/description/
 *
 * @author UnknownAR
 * @date 05-10-2025
 */
public class LSNBXOR {
    public int longestSubsequence(int[] nums) {
        int sum = 0;
        for(int num:nums)
            sum = sum^num;
        if(sum!=0)
            return nums.length;
        for (int num : nums) {
            if (num != 0) {
                return nums.length - 1;
            }
        }
        return 0;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        LSNBXOR obj = new LSNBXOR();
    }
}