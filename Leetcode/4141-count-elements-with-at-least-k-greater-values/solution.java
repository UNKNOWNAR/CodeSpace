class Solution {
    public int countElements(int[] nums, int k) {
        if(k==0)
            return nums.length;
        Arrays.sort(nums);
        if(nums.length-k<0)
            return 0;
        int boundary = nums[nums.length-k];
        int count = 0;
        for(int num:nums){
            if(num<boundary)
                count++;
        }
        return count;
    }
}
