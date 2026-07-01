import java.util.Map;
import java.util.HashMap;

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.length() < needle.length()) return -1;

        Map<Character, Integer> map = new HashMap<>();
        int len = needle.length();
        for (int k = 0; k < len; k++) {
            map.put(needle.charAt(k), k);
        }

        int indx = len - 1;

        while (indx < haystack.length()) {
            int i = len - 1;
            int temp = indx;

            while (i >= 0 && haystack.charAt(temp) == needle.charAt(i)) {
                i--;
                temp--;
            }

            if (i < 0) {
                return indx - len + 1;
            }
            
            char badChar = haystack.charAt(temp);
            int lastPos = map.getOrDefault(badChar, -1);
            int shift = Math.max(1, i - lastPos);
            
            indx += shift;
        }

        return -1;
    }
}
