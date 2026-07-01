class Solution {
    public long clacGCD(long num1,long num2){
        return (num2==0)?Math.abs(num1):clacGCD(num2,num1%num2);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long prefixGcd[] = new long[n];
        long maxi = 0;
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,nums[i]);
            prefixGcd[i] = clacGCD(maxi,nums[i]);
        }
        Arrays.sort(prefixGcd);
        long sum = 0;
        for(int i=0;i<n/2;i++)
            sum += clacGCD(prefixGcd[i],prefixGcd[n-i-1]);
        
        return sum;
    }
}
