package LeetCode.contset;

import java.util.*;
import java.io.*;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 14-09-2025
 */
public class MSAMKDE {
    public int[] maxKDistinct(int[] nums, int k) {
        int ans[] = new int[k];
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            if(i==0)
                ans[i] = nums[nums.length-1];
            else{
                int temp = i;
                while(ans[i-1]==nums[nums.length-temp-1])
                    temp++;
                ans[i] =nums[nums.length-temp-1];
            }
        }
        return ans;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        MSAMKDE obj = new MSAMKDE();
        obj.maxKDistinct(new int[]{84,93,100,77,93},3);
    }
}