class Solution {
    int maxN;
    Integer dp[];
    public int integerBreak(int n) {
        dp = new Integer[n+1];
        int maxmProduct = 1;
        for(int i=1;i<n;i++)
            maxmProduct = Math.max(breakNumber(n-i)*i,maxmProduct);
        return maxmProduct;
    }
    public int breakNumber(int n){
        if(dp[n]!=null)
            return dp[n];
        int maxmProduct = 1;
        for(int i=1;i<=n;i++)
            maxmProduct = Math.max(breakNumber(n-i)*i,maxmProduct);
        return dp[n]=maxmProduct;
    }
}
