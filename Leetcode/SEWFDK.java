package LeetCode.contset.Weekly_Contest471;

import java.util.*;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 12-10-2025
 */
public class SEWFDK {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for(int key : map.keySet()){
            if(map.get(key)%k==0){
                sum += map.get(key)*key;
            }
        }
        return sum;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        SEWFDK obj = new SEWFDK();
    }
}