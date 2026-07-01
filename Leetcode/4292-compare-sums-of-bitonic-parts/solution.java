class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        int indx = 1;
        long sum1 = nums[0];
        long sum2 = 0;
        while(indx<n&&nums[indx]>nums[indx-1])
            sum1 += nums[indx++];
        sum2 = nums[indx-1];
        while(indx<n)
            sum2 += nums[indx++];
        if(sum1==sum2)
            return -1;
        else if(sum1>sum2)
            return 0;
        return 1;
    }
}
