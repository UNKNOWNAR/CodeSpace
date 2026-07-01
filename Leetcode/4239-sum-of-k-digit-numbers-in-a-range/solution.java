import java.math.BigInteger;
class Solution {
    private static final BigInteger MOD = BigInteger.valueOf(1000000007);
    public int sumOfNumbers(int l, int r, int k) {
        if(k==0)
            return 0;
        int n = (r-l+1);
        BigInteger sum_digits = BigInteger.valueOf(l+r).multiply(BigInteger.valueOf(n)).divide(BigInteger.valueOf(2));
        BigInteger freq = BigInteger.valueOf(n).modPow(BigInteger.valueOf(k-1),MOD);
        BigInteger tenK = BigInteger.TEN.modPow(BigInteger.valueOf(k), MOD);
        BigInteger num = tenK.subtract(BigInteger.ONE).add(MOD).mod(MOD);
        BigInteger inV9 = BigInteger.valueOf(9).modInverse(MOD);
        BigInteger a = num.multiply(inV9).mod(MOD);
        BigInteger result = sum_digits.multiply(freq).mod(MOD).multiply(a).mod(MOD);
       return result.intValue();
    }
}
