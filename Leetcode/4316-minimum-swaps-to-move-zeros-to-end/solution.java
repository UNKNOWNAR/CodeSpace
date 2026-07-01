class Solution {
    public int minimumSwaps(int[] nums) {
        int Z = 0;
        for(int num:nums){
            if(num==0)
                Z++;
        }
        int n = nums.length;
        int ans = 0;
        for(int i=n-1;i>=n-Z;i--){
            if(nums[i]!=0)
                ans++;
        }
        return ans;
    }
}
