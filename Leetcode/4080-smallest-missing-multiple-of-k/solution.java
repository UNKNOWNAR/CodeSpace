class Solution {
    public int missingMultiple(int[] nums, int k) {
        int a = k;
        Arrays.sort(nums);
        for(int num:nums){
            if(num==a)
                a+=k;
        }
        return a;
    }
}
