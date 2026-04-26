package LeetCode.contset.Weekly_Contest467;

import java.util.*;
import java.io.*;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 04-10-2025
 */
public class NSS {
    public int countStableSubsequences(int[] nums) {
        return count(nums,0,0,-1,new ArrayList<>());
    }
    public int count(int[] nums,int prev,int no,int indx,ArrayList<Integer> list){
        int countStableSubsequences=0;
        for(int i=indx+1;i<nums.length;i++){
            if((prev+nums[i])%2==0){
                if(no==2)
                    countStableSubsequences += 1 + count(nums, prev, no, i, list);
                else {
                    list.add(nums[i]);
                    countStableSubsequences += 1 + count(nums, nums[i], no + 1, i, list);
                    System.out.println(list);
                    list.removeLast();
                }
            }
            else{
                list.add(nums[i]);
                countStableSubsequences += 1 + count(nums, nums[i], 1, i, list);
                System.out.println(list);
                list.removeLast();
            }
        }
        return countStableSubsequences;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        NSS obj = new NSS();
        obj.countStableSubsequences(new int[]{7,17,7,8});
    }
}