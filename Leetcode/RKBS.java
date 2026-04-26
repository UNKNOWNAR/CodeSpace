package LeetCode.contset.Weekly_Contest470;

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
public class RKBS {
    public String removeSubstring(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=k-1;i<sb.length()-k;i++){
                if(sb.charAt(i)==')')
                    continue;
                int temp = 0;
                while(temp!=k&&sb.charAt(i-temp)=='('&&sb.charAt(i+temp+1)==')'){
                    temp++;
                }
                if(temp==k){
                    sb.delete(i-k+1,i+k+1);
                    flag = true;
                    break;
                }
            }
        }
        return sb.toString();
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        RKBS obj = new RKBS();
        System.out.println(obj.removeSubstring("((()))()()()", 3));
    }
}