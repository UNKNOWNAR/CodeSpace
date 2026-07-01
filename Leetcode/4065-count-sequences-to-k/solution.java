class Solution {
    long k;
    Map<String, Integer> memo;
    public int countSequences(int[] nums, long k) {
        memo = new HashMap<>();
        this.k = k;
        return count(nums,0,1,1);
    }
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public int count(int nums[], int indx, long num, long den) {
        long common = gcd(num, den);
        num /= common;
        den /= common;
        if(indx==nums.length)
            return (den != 0 && num == k * den) ? 1 : 0;
        String state = indx + "," + num + "/" + den;
        if (memo.containsKey(state)) 
            return memo.get(state);

        int res = count(nums, indx + 1, num, den)+
        count(nums, indx + 1, num * nums[indx], den)+
        count(nums, indx + 1, num, den * nums[indx]);
        memo.put(state, res);
        return res;
    }
}
