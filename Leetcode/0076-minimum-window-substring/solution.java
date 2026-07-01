class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        // 1. Map for target characters (ASCII 128)
        int[] targetMap = new int[128];
        for (char c : t.toCharArray()) {
            targetMap[c]++;
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int required = t.length(); // Total chars needed (including duplicates)
        
        // Convert s to array for faster access
        char[] sChars = s.toCharArray();

        while (right < s.length()) {
            char current = sChars[right];
            
            // If current char is in t, decrement required count
            // (Only if we still need instances of this char)
            if (targetMap[current] > 0) {
                required--;
            }
            
            // Always decrement map count (indicates char is in window)
            // Values becomes negative if we have surplus characters
            targetMap[current]--;
            right++;

            // Contract window as long as it is valid (required == 0)
            while (required == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char toRemove = sChars[left];
                
                // If we remove a char that was part of the target count
                // (Value is 0 means we had exactly enough, so removing makes it 1 needed)
                targetMap[toRemove]++;
                
                if (targetMap[toRemove] > 0) {
                    required++;
                }
                
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
