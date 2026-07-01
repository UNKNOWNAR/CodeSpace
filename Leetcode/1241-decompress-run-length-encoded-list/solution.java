class Solution {
    public int[] decompressRLElist(int[] nums) {
        int l = 0,x=nums.length;
        for(int i=0;i<x;i+=2)
            l+=nums[i];
        int ans[] = new int[l];
        x--;
        while(l>0)
        {
            if(nums[x-1]!=0){
                l--;
                ans[l]=nums[x];
                nums[x-1]--;
            }
            else
                x-=2;
        }
        return ans;
    }
}
