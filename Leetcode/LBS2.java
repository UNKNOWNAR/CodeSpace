package LeetCode.contset.Weekly_Contest471;

/**
 * Solution for:
 * Problem:
 * LeetCode Link:
 *
 * @author UnknownAR
 * @date 12-10-2025
 */
public class LBS2 {
    public int longestBalanced(String s) {
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            int frequency[] = new int[3];
            frequency[s.charAt(i)-'a'] = 1;
            for (int j = i+1; j < s.length(); j++) {
                frequency[s.charAt(j)-'a'] += 1;
                int freq = -1;
                for(int f: frequency) {
                    if(freq==-1)
                        freq = f;
                    else if(f != freq) {
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
        LBS2 obj = new LBS2();
        System.out.println(obj.longestBalanced("abbac"));
    }
}