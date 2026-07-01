class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans = nums.length;
        int indx = start;
        while(indx<nums.length){
            if(nums[indx]==target){ 
                ans = Math.min(ans,Math.abs(start-indx));
                break;
            }
            indx++;
        }
        indx = start;
        while(indx>=0){
            if(nums[indx]==target){ 
                ans = Math.min(ans,Math.abs(start-indx));
                break;
            }
            indx--;
        }
        return ans;
    }
}
