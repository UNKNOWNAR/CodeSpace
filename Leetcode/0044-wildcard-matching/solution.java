class Solution {
    int dp[][];
    public boolean isMatch(String s, String p) {
        dp = new int[s.length()][p.length()];
        for(int rows[]:dp)
            Arrays.fill(rows,-1);
        return Match(s.length()-1,p.length()-1,s,p)==1;
    }
    public int Match(int i,int j,String s,String p){
        if(j<0&&i<0)
            return 1;
        if(i<0){
            for (int k = 0; k <= j; k++) {
                if (p.charAt(k) != '*') 
                    return 0;
            }
            return 1;
        }
        if(j<0&&i>=0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        if(s.charAt(i)==p.charAt(j))
            return dp[i][j] = Match(i-1,j-1,s,p);
        if(p.charAt(j)=='?')
            return dp[i][j] = Match(i-1,j-1,s,p);
        if(p.charAt(j)=='*')
            return dp[i][j] = (Match(i-1,j,s,p)+Match(i,j-1,s,p))>=1?1:0;
        else
            return dp[i][j] = 0;
    }
}
