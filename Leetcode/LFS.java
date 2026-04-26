package LeetCode.contset.Biweekly_Contest167;

import java.util.*;
import java.io.*;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 11-10-2025
 */
public class LFS {
    public int longestSubarray(int[] nums) {
        int max = 2;
        for(int i=0;i<nums.length-2;i++){
            int temp = i;
            for(int j=i+2;j<nums.length;j++){
                if(nums[temp]+nums[temp+1]==nums[j]) {
                    max = Math.max(max, j - i + 1);
                    temp++;
                }
                else
                    break;
            }
        }
        return max;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        LFS obj = new LFS();
        System.out.println(obj.longestSubarray(new int[]{5,2,7,9,16}));
    }
}