import java.util.Arrays;

class Solution {
    public int countBinaryPalindromes(long n) {
        if (n == 0) return 1;

        String s = Long.toBinaryString(n);
        int len = s.length();
        int count = 0;

        for (int l = 1; l < len; l++) {
            count += (1L << ((l - 1) / 2));
        }

        String prefix_str = s.substring(0, (len + 1) / 2);
        long prefix_val = Long.parseLong(prefix_str, 2);
        
        long base = (1L << ((len - 1) / 2));
        
        count += prefix_val - base;

        String palindrome_from_prefix = prefix_str + new StringBuilder(prefix_str.substring(0, len / 2)).reverse().toString();
        long palindrome_val = Long.parseLong(palindrome_from_prefix, 2);

        if (palindrome_val <= n) {
            count++;
        }
        
        return count + 1;
    }
}


