class Solution {
    public int hammingWeight(int n) {
        if(n<=1)
            return n;
        if((n&1)==1)
            return 1+hammingWeight(n>>1);
        else
            return hammingWeight(n>>1);
    }
}
