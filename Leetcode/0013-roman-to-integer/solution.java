class Solution {
    private int value(char c) {
        return switch (c) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }

    public int romanToInt(String s) {
        int ans = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = value(s.charAt(i));
            if (curr < prev) ans -= curr;
            else ans += curr;
            prev = curr;
        }
        return ans;
    }
}

