class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l=0,r=1;
        int n=nums.length;
        while(l<n && r<n){
            while(l<n && nums[l]%2==0){
                l+=2;
            }
            while(r<n && nums[r]%2==1){
                r+=2;
            }
            if(l<n && r<n){
                int temp = nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
            }
        }
        return nums;
    }
}
