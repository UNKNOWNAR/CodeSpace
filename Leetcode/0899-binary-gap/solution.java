class Solution {
    public int binaryGap(int num) {
        int maxGap = 0;
        int prev = 33;
        int curr = 0;
        while(num!=0){
            if((num&1)==1){
                maxGap = Math.max(maxGap,curr-prev);
                prev = curr;
            }
            num = num>>1;
            curr++;
        }
        return maxGap;
    }
}
