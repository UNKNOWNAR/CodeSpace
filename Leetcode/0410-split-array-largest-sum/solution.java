class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int num:nums){
            high += num;
            low = Math.max(low,num);
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(countStudents(nums,mid)>k)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;
    }
    private int countStudents(int nums[],int maxmSum){
        int splits = 1;
        int sum = 0;
        for(int num:nums){
            if(num+sum<=maxmSum)
                sum+=num;
            else{
                sum = num;
                splits++;
            }
        }
        return splits;
    }
}
