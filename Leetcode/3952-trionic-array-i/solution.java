class Solution {
    public boolean isTrionic(int[] nums) {
        int change = 0;
        boolean flag = false;
        for(int i=0;i<nums.length-1;i++){
            if(!flag&&i!=0&&nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
                change++;
                flag = true;
            }
            else if(flag&&i!=0&&nums[i]<nums[i-1]&&nums[i]<nums[i+1]){
                change++;
                flag = false;
            }
            if(!flag&&nums[i]>=nums[i+1])
                return false;
            if(flag&&nums[i]<=nums[i+1])
                return false;
        }
        return (change==2);
    }
}
