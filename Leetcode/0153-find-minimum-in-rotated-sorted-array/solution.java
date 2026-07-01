class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int min = 5001;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[low]<=nums[high]){//both side sorted
                min = Math.min(min,nums[low]);
                break;
            }
            else if(nums[mid]>=nums[low]){//left sorted
                min = Math.min(min,nums[low]);
                low = mid+1;
            }
            else{
                min = Math.min(min,nums[mid]);
                high = mid-1;
            }
        }
        return min;
    }
}
