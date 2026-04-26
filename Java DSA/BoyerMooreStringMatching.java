import java.util.*;

public class BoyerMooreStringMatching {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int n = haystack.length();
        int m = needle.length();
        if (n < m) return -1;

        // Preprocessing: Create the bad character lookup table
        Map<Character, Integer> badCharTable = new HashMap<>();
        for (int i = 0; i < m; i++) {
            badCharTable.put(needle.charAt(i), i);
        }

        int alignmentEnd = m - 1; // Main index tracking the end of the alignment in haystack

        while (alignmentEnd < n) {
            int needleIndex = m - 1;
            int haystackIndex = alignmentEnd;

            // Compare backwards from the end of the needle
            while (needleIndex >= 0 && haystack.charAt(haystackIndex) == needle.charAt(needleIndex)) {
                needleIndex--;
                haystackIndex--;
            }

            // If a full match was found (needleIndex is -1)
            if (needleIndex < 0) {
                return alignmentEnd - m + 1; // Success
            }

            // If a mismatch occurred, calculate the safe shift
            char badChar = haystack.charAt(haystackIndex);
            int lastOccurrence = badCharTable.getOrDefault(badChar, -1);
            int shift = Math.max(1, needleIndex - lastOccurrence);

            alignmentEnd += shift;
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        BoyerMooreStringMatching ob = new BoyerMooreStringMatching();

        int result1 = ob.strStr("mississippi", "issi");
        System.out.println("Input: mississippi, issi | Output: " + result1); // Expected: 1

        int result2 = ob.strStr("hello", "ll");
        System.out.println("Input: hello, ll | Output: " + result2); // Expected: 2
    }
}