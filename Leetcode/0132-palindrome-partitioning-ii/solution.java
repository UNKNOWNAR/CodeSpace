class Solution {
    String s;
    int dp[];
    boolean[][] isPal;
    public int minCut(String s) {
        dp = new int[s.length()];
        Arrays.fill(dp,-1);
        isPal = new boolean[s.length()][s.length()];
        this.s = s;
        // This loop fills the table. A substring s[i..j] is a palindrome if
        // its ends s[i] and s[j] match, AND the inner part s[i+1..j-1] is also a palindrome.
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || isPal[i + 1][j - 1])) {
                    isPal[i][j] = true;
                }
            }
        }
        return min(0);
    }
    public int min(int i){
        if(i==s.length())
            return -1;
        if(dp[i]!=-1)
            return dp[i];
        int min = s.length()-1;
        for(int j=i;j<s.length();j++){
            if(isPal[i][j])
                min = Math.min(min, 1 + min(j+1));
        }
        return dp[i]=min;
    }
}
