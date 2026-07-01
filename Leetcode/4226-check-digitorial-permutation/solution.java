class Solution {
    private static final int[] FACT = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

    public boolean isDigitorialPermutation(int n) {
        // Handle single digits directly for speed
        if (n < 10) return n == FACT[n]; 

        int[] freq = new int[10];
        long sum = 0;
        int temp = n;
        int countN = 0;

        while (temp > 0) {
            int d = temp % 10;
            freq[d]++;
            sum += FACT[d];
            temp /= 10;
            countN++;
        }

        // Verify digits of sum against the freq array
        long tempSum = sum;
        int countSum = 0;
        while (tempSum > 0) {
            int d = (int)(tempSum % 10);
            if (--freq[d] < 0) return false; // More of a digit than original
            tempSum /= 10;
            countSum++;
        }

        // Must have same number of digits and all frequencies must be zero
        return countN == countSum;
    }
}
