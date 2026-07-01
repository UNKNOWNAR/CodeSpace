class Solution {
    public int minimumCost(int[] nums) {
        if(nums.length==3)
            return nums[0]+nums[1]+nums[2];
        int min=Integer.MAX_VALUE,secondmin=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                secondmin = min;
                min = nums[i];
            }
            else if(secondmin>nums[i])
                secondmin = nums[i];
        }
        return nums[0]+min+secondmin;
    }
}
