class Solution {
public int numDecodings(String s) {
        int dp[] = new int[s.length()+1];
        dp[s.length()] = 1;
        for(int indx=s.length()-1;indx>=0;indx--){
            int count1 = 0;
            if(s.charAt(indx)!='0')
                count1= dp[indx+1];
            int count2 = 0;
            if(indx<s.length()-1) {
                String grp2 = s.substring(indx, indx + 2);
                if (Integer.parseInt(grp2) > 9 && Integer.parseInt(grp2) <= 26)
                    count2 = dp[indx + 2];
            }
            dp[indx] = count1+count2;
        }
        return dp[0];
    }
}
