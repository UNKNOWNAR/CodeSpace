class Solution {
    public int sumOfMultiples(int n) {
        return sumDivisibleBy(n, 3) +
               sumDivisibleBy(n, 5) +
               sumDivisibleBy(n, 7) -
               sumDivisibleBy(n, lcm(3, 5)) -
               sumDivisibleBy(n, lcm(3, 7)) -
               sumDivisibleBy(n, lcm(5, 7)) +
               sumDivisibleBy(n, lcm(3, lcm(5, 7)));
    }

    private int sumDivisibleBy(int n, int x) {
        int k = n / x;
        return x * k * (k + 1) / 2;
    }

    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
