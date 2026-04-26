package LeetCode.contset.Weekly_Contest472;

import java.util.*;
import java.io.*;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 19-10-2025
 */
public class LBS {
    public int longestBalanced(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> frequency = new HashSet<>();
            int no=0,ne=0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]%2==0&&!frequency.contains(nums[j]))
                    ne++;
                else if(!frequency.contains(nums[j]))
                    no++;
                frequency.add(nums[j]);
                if(ne==no)
                    ans = Math.max(ans,j-i+1);
            }

        }
        return ans;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        LBS obj = new LBS();
        System.out.println(obj.longestBalanced(new int[]{2,5,4,3}));
    }
}