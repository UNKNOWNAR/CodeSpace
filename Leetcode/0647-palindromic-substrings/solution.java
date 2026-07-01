class Solution {
    int count = 0;

    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Iterate through each character to use it as a center
        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd-length palindromes (center is the character at i)
            expandAndCount(s, i, i);
            
            // Case 2: Even-length palindromes (center is between i and i+1)
            expandAndCount(s, i, i + 1);
        }
        
        return count;
    }

    private void expandAndCount(String s, int left, int right) {
        // Expand as long as the pointers are valid and the characters match
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            // Each valid expansion finds one new palindromic substring
            count++;
            
            // Move pointers outwards
            left--;
            right++;
        }
    }
}
