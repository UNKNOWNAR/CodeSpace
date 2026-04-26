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
public class LBS1 {
    public int longestBalanced(String s) {
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            Map<Character,Integer> frequency = new HashMap<>();
            frequency.put(s.charAt(i), 1);
            for (int j = i+1; j < s.length(); j++) {
                frequency.put(s.charAt(j),frequency.getOrDefault(s.charAt(j),0)+1);
                int freq = -1;
                for(char key:frequency.keySet()){
                    if(freq==-1)
                        freq = frequency.get(key);
                    else if(frequency.get(key) != freq) {
                        freq = -5;
                        break;
                    }
                }
                if(freq!=-5)
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
        LBS1 obj = new LBS1();
        System.out.println(obj.longestBalanced("aabcc"));
    }
}