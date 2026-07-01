class Solution {
    public int concatenatedBinary(int n) {
        int mod = 1_000_000_007;
        int size = 0;
        long ans = 0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0)
                size++;
            ans = ((ans<<size)|i)%mod;
        }
        return (int)ans;
    }
}
