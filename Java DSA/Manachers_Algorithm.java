public class Manachers_Algorithm {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        // Step 1: Preprocess string to insert '#' between chars and at ends
        String t = preprocess(s);
        int n = t.length();

        int[] p = new int[n]; // Array to hold palindrome radius lengths
        int center = 0, right = 0; // Center and right edge of current rightmost palindrome
        int maxLen = 0, maxCenter = 0; // Track max palindrome info

        for (int i = 1; i < n - 1; i++) {
            // Mirror position of i around center
            int mirror = 2 * center - i;

            // Initialize p[i] based on palindrome radius at mirror
            if (i < right)
                p[i] = Math.min(right - i, p[mirror]);

            // Try to expand palindrome centered at i
            while (t.charAt(i + (1 + p[i])) == t.charAt(i - (1 + p[i])))
                p[i]++;

            // Update center and right boundary if palindrome at i expands past right
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            // Track max palindrome length and center
            if (p[i] > maxLen) {
                maxLen = p[i];
                maxCenter = i;
            }
        }

        // Extract longest palindrome from original string using maxCenter and maxLen
        int start = (maxCenter - maxLen) / 2; // convert index back to original string
        return s.substring(start, start + maxLen);
    }

    // Insert boundaries between chars and at ends: e.g., "abba" -> "^#a#b#b#a#$"
    private String preprocess(String s) {
        StringBuilder sb = new StringBuilder("^");
        for (char c : s.toCharArray()) {
            sb.append("#").append(c);
        }
        sb.append("#$");
        return sb.toString();
    }

    public static void main(String[] args) {
        Manachers_Algorithm s = new Manachers_Algorithm();
        s.longestPalindrome("babad");
    }
}
