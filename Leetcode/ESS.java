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
public class ESS {
    public boolean scoreBalance(String s) {
        StringBuilder sb =  new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            int sum = 0;
            for (int j = 0; j<=i; j++) {
                sum += sb.charAt(j)-'a';
            }
            for(int j=i+1;j<sb.length();j++){
                sum -= sb.charAt(j)-'a';
            }
            if(sum==0)
                return true;
        }
        return false;
    }

    // ===================================================================
    // THIS IS YOUR LOCAL TESTING AREA - DO NOT SUBMIT THIS
    // ===================================================================
    public static void main(String[] args) {
        // 1. Create an instance of the solution class
        ESS obj = new ESS();
        System.out.println(obj.scoreBalance("edb"));
    }
}