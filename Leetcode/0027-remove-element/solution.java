class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                if(i!=k)
                {
                    nums[k]+=nums[i];
                    nums[i]=nums[k]-nums[i];
                    nums[k]=nums[k]-nums[i];
                }
                k++;
            }
        }
        return k;
    }
}
