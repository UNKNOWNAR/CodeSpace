class Solution {
    public boolean checkOnesSegment(String s) {
        for (int i = 1; i < s.length(); i++) {
            // Check for the "01" pattern
            if (s.charAt(i - 1) == '0' && s.charAt(i) == '1') {
                return false;
            }
        }
        return true;
    }
}
