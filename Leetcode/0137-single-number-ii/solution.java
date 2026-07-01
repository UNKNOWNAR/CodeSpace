class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int bitIndx=0;bitIndx<32;bitIndx++){
            int count = 0;
            for(int num:nums){
                if((num&(1<<bitIndx))!=0)
                    count++;
            }
            if(count%3==1)
                ans = ans | (1<<bitIndx);
        }
        return ans;
    }
}
