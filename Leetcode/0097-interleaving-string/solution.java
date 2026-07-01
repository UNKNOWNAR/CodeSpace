class Solution {
    String s1,s2,s3;
    Boolean dp[][];
    public boolean isInterleave(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        dp = new Boolean[s1.length()+1][s2.length()+1];
        if(s1.length()+s2.length()!=s3.length())
            return false;
        return checkInterleave(0,0,0);
    }
    public boolean checkInterleave(int indx1,int indx2,int indx3){
        if(indx1==s1.length()&&indx2==s2.length()&&indx3==s3.length())
            return true;
        if(dp[indx1][indx2]!=null)
            return dp[indx1][indx2];
        boolean ans = false;
        if(indx1!=s1.length()&&s1.charAt(indx1)==s3.charAt(indx3))
            ans = ans || checkInterleave(indx1+1,indx2,indx3+1);
        if(indx2!=s2.length()&&s2.charAt(indx2)==s3.charAt(indx3))
            ans = ans || checkInterleave(indx1,indx2+1,indx3+1);
        return dp[indx1][indx2]=ans;
    }
}
