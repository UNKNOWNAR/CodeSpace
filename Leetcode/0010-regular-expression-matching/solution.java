class Solution {
    String s, p;
    Boolean[][] dp;

    public boolean isMatch(String s, String p) {
        this.s = s;
        this.p = p;
        dp = new Boolean[s.length() + 1][p.length() + 1];
        return dfs(0, 0);
    }

    private boolean dfs(int i, int j) {
        if (dp[i][j] != null) return dp[i][j];

        // Pattern finished
        if (j == p.length()) {
            return dp[i][j] = (i == s.length());
        }

        boolean firstMatch = (i < s.length() &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        // Handle '*'
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            dp[i][j] = dfs(i, j + 2) || (firstMatch && dfs(i + 1, j));
        } else {
            dp[i][j] = firstMatch && dfs(i + 1, j + 1);
        }

        return dp[i][j];
    }
}

