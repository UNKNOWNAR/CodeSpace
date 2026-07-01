import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> allPartitions = new ArrayList<>();
        findPartitions(s, 0, new ArrayList<>(), allPartitions);
        return allPartitions;
    }

    private void findPartitions(String s, int start, List<String> currentPartition, List<List<String>> allPartitions) {
        // Base Case: If we've reached the end of the string, we've found a valid partition.
        if (start == s.length()) {
            allPartitions.add(new ArrayList<>(currentPartition));
            return;
        }

        // Recursive Step: Explore all possible partitions starting from 'start'.
        for (int i = start; i < s.length(); i++) {
            // Check if the substring s[start...i] is a palindrome.
            if (isPalindrome(s, start, i)) {
                // 1. Choose: This is a valid piece for our partition.
                currentPartition.add(s.substring(start, i + 1));

                // 2. Explore: Recurse on the rest of the string.
                findPartitions(s, i + 1, currentPartition, allPartitions);

                // 3. Backtrack: Undo the choice to explore other possibilities.
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    // Helper function to check if a substring is a palindrome.
    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
