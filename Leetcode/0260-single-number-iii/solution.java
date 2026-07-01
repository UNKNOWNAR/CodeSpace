class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums)
            xor ^= num;
        int rightmostdiffbit = (xor^(xor-1))&xor;
        int b1=0,b2=0;
        for(int num:nums){
            if((num&rightmostdiffbit)!=0)
                b1 = b1^num;
            else
                b2 = b2^num;
        }
        return new int[]{b1,b2};
    }
}
