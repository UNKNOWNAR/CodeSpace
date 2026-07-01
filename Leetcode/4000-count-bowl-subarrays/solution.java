class Solution {
    public long bowlSubarrays(int[] nums) {
        int n=nums.length;
        int c=0;
        int ml=Integer.MIN_VALUE;
        int[] arr=new int[n];
        int mc=Integer.MIN_VALUE;
        for (int i=n-1;i>=0;i--) 
        {
            arr[i]=mc;
            if (nums[i]>mc) 
            {
                mc=nums[i];
            }
        }
        for (int i=0;i<n;i++) 
        {
            if(ml> nums[i] &&arr[i]>nums[i]) 
            {
                c++;
            }
            ml= Math.max(ml,nums[i]);
        }
        return c;
    }
}
