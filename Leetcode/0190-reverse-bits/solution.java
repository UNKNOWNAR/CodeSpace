class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for(int bitIndx = 31;bitIndx>=0;bitIndx--){
            int bit = (n >> bitIndx) & 1;
            ans = ans | (bit << (31 - bitIndx));
        }
        return ans;
    }
}
