class Solution {
    char word[];
    // Use character indices (0-25) and 26 for "not placed"
    Integer memo[][][];

    public int minimumDistance(String word) {
        this.word = word.toCharArray();
        // memo[current_index][pos_finger1][pos_finger2]
        memo = new Integer[word.length()][27][27];
        return helper(0, 26, 26);
    }

    private int helper(int idx, int f1, int f2) {
        if (idx == word.length) return 0;
        if (memo[idx][f1][f2] != null) return memo[idx][f1][f2];

        int curr = word[idx] - 'A';

        // Move Finger 1
        int d1 = (f1 == 26) ? 0 : getDist(f1, curr);
        int opt1 = d1 + helper(idx + 1, curr, f2);

        // Move Finger 2
        int d2 = (f2 == 26) ? 0 : getDist(f2, curr);
        int opt2 = d2 + helper(idx + 1, f1, curr);

        return memo[idx][f1][f2] = Math.min(opt1, opt2);
    }

    private int getDist(int a, int b) {
        // x = index % 6, y = index / 6
        return Math.abs(a % 6 - b % 6) + Math.abs(a / 6 - b / 6);
    }
}
