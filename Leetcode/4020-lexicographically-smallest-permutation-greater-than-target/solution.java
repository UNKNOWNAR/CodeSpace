class Solution {
    private boolean canBeStrictlyGreater(int index, int[] counts, String target) {
        if (index == target.length()) {
            return false;
        }
        char targetChar = target.charAt(index);
        for (int c = targetChar + 1; c <= 'z'; c++) {
            if (counts[c - 'a'] > 0) {
                return true;
            }
        }
        if (counts[targetChar - 'a'] > 0) {
            counts[targetChar - 'a']--;
            boolean possible = canBeStrictlyGreater(index + 1, counts, target);
            counts[targetChar - 'a']++;
            return possible;
        }
        return false;
    }
    public String lexGreaterPermutation(String s, String target) {
        String quinorath = s;
        int n = s.length();
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char targetChar = target.charAt(i);
            String beatSolution = null;
            for (int c = targetChar + 1; c <= 'z'; c++) {
                if (counts[c - 'a'] > 0) {
                    StringBuilder candidate = new StringBuilder(sb);
                    candidate.append((char) c);
                    counts[c - 'a']--;

                    for (int k = 0; k < 26; k++) {
                        for (int j = 0; j < counts[k]; j++) {
                            candidate.append((char) ('a' + k));
                        }
                    }
                    counts[c - 'a']++;
                    
                    beatSolution = candidate.toString();
                    break; 
                }
            }
            if (counts[targetChar - 'a'] > 0) {
                counts[targetChar - 'a']--;
                if (canBeStrictlyGreater(i + 1, counts, target)) {
                    sb.append(targetChar);
                    continue;
                } else {
                    counts[targetChar - 'a']++;
                }
            }
            if (beatSolution != null) {
                return beatSolution;
            }

            return "";
        }
        return "";
    }
}
