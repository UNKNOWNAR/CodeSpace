class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        long seen = 0;
        for(int num:nums){
            if((seen&(1L<<num))==0)
                seen = seen|(1L<<num);
            else
                ans^=num;
        }
        return ans;
    }
}
