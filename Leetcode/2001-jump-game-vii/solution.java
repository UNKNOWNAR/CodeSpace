class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        /*if(s.charAt(n-1)=='1')
            return false;*/
        int dp[] = new int[n];
        dp[0] = 1;
        int count = 0;
        for(int i=1;i<n;i++){
            if(i>=minJump)
                count += dp[i-minJump];
            if(i>=maxJump+1)
                count -= dp[i-maxJump-1];
            if(count>0&&s.charAt(i)=='0')
                dp[i] = 1;
        }
        return dp[n-1]==1;
    }
}
