class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    private int helper(int[] nums, int goal){
        if(goal<0)  return 0;
        int n =nums.length,l=0,r=0,count=0,sum = 0;
        while(r<n){
            sum += nums[r]%2;
            while(sum>goal)
                sum -= nums[l++]%2;
            count+=r-l+1;
            r++;
        }
        return count;
    }
}
