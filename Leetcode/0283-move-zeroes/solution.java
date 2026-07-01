class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        if(l<2)
            return;
        int p1 = 0;
        for(int i=0;i<l;i++) {
            if (nums[i] != 0) {
                if (p1 != i) {
                    nums[p1] = nums[i];
                    nums[i] = 0;
                }
                p1++;
            }
        }
    }
}
