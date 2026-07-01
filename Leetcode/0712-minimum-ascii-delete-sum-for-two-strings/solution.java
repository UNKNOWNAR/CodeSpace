class Solution {
    String s1;
    String s2;
    Integer dp[][];
    public int minimumDeleteSum(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        dp = new Integer[s1.length()][s2.length()];
        return helper(0,0);
    }
    public int helper(int indx1,int indx2){
        int calc = Integer.MAX_VALUE;
        if(indx1==s1.length()&&indx2==s2.length())
            return 0;
        else if(indx1==s1.length()){
            calc = 0;
            for(int i=indx2;i<s2.length();i++)
                calc += s2.charAt(i);
            return calc;
        }
        else if(indx2==s2.length()){
            calc = 0;
            for(int i=indx1;i<s1.length();i++)
                calc += s1.charAt(i);
            return calc;
        }
        if(dp[indx1][indx2]!=null)
            return dp[indx1][indx2];
        if(s1.charAt(indx1)==s2.charAt(indx2))
            calc = Math.min(calc,helper(indx1+1,indx2+1));
        
        calc = Math.min(calc,(int)(s1.charAt(indx1)+helper(indx1+1,indx2)));
        calc = Math.min(calc,(int)(s2.charAt(indx2)+helper(indx1,indx2+1)));

        return dp[indx1][indx2]=calc;
    }
}
