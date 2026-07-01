class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Convert wordList to a set for O(1) lookup
        Set<String> wordSet = new HashSet<>(wordList);
        
        if (!wordSet.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;  // beginWord is level 1

        while (!queue.isEmpty()) {
            int size = queue.size(); // number of words at current level
            for (int i = 0; i < size; i++) {
                String word = queue.poll();

                // Try changing every character
                for (int j = 0; j < word.length(); j++) {
                    char[] chars = word.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[j] = ch;
                        String transformed = new String(chars);

                        if (transformed.equals(endWord)) {
                            return level + 1; // Found the endWord
                        }

                        if (wordSet.contains(transformed)) {
                            queue.add(transformed);
                            wordSet.remove(transformed); // Mark as visited
                        }
                    }
                }
            }
            level++; // Move to next level
        }

        return 0; // endWord not reachable
    }
}
