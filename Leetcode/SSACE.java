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
public class SSACE {
    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        int n = nums.length;
        boolean ans[] = new boolean[n];
        for(int x=1;x<=n;x++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum+=Math.min(x,nums[j]);
                if(sum==k){
                    ans[x-1] = true;
                    break;
                }
            }
        }
        return ans;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        SSACE obj = new SSACE();
        obj.subsequenceSumAfterCapping( new int[]{4,3,2,4},5);
    }
}