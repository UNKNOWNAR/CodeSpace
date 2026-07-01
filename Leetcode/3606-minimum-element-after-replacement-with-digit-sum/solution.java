class Solution {
    private int sumofDigits(int num){
        int sum = 0;
        while(num>0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int minm = (int)1e9;
        for(int i=0;i<nums.length;i++)
            minm = Math.min(minm,sumofDigits(nums[i]));
        return minm;
    }
}
