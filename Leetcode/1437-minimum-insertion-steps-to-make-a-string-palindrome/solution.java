class Solution {
    public int minInsertions(String s) {
        int dp[] = new int[s.length()+1];
        String s1 = new StringBuilder(s).reverse().toString();
        for(int indx=1;indx<=s.length();indx++){
            int curr[] = new int[s.length()+1];
            for(int indx1=1;indx1<=s.length();indx1++){
                if(s.charAt(indx-1)==s1.charAt(indx1-1))
                    curr[indx1] = 1+dp[indx1-1];
                else
                    curr[indx1] = Math.max(curr[indx1-1],dp[indx1]);
            }
            dp = curr;
        }
        return s.length()-dp[s.length()];
    }
}
