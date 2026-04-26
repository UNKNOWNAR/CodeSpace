package LeetCode.contset.Biweekly_Contest165;

import java.util.*;
import java.io.*;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 13-09-2025
 */
public class SAPGTA {
    public int exampleMethod(int[] nums) {
        int sum=0;
        for(int num:nums)
            sum+=num;
        sum = sum/nums.length;
        Arrays.sort(nums);
        int prev = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0||nums[i]<=sum){
                prev = nums[i];
                continue;
            }
            int temp = Math.max(0,Math.max(prev+1,sum+1));
            while(temp!=nums[i]){
                return temp++;
            }
            temp = nums[i];
        }
        return nums[nums.length-1]+1;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        SAPGTA obj = new SAPGTA();
        obj.exampleMethod(new int[]{-1,1,2});
    }
}