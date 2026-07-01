class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int result[] = new int[len];
        for(int i=0;i<len;i++){
            if(nums[i]==0)
                result[i] = 0;
            else if(nums[i]>0)
                result[i] = nums[(i+nums[i])%len];
            else
                result[i] = nums[(len*100+i-Math.abs(nums[i]))%len];
        }
        return result;
    }
}
