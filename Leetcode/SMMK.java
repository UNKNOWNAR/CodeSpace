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
public class SMMK {
    public int missingMultiple(int[] nums, int k) {
        int a = k;
        Arrays.sort(nums);
        for(int num:nums){
            if(num==a)
                a*=k;
        }
        return a;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        SMMK obj = new SMMK();
        obj.missingMultiple(new int[]{8,2,3,4,6}, 2);
    }
}