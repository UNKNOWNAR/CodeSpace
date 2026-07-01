class Solution {
    public int findComplement(int n) {
        int indx = 0;
        int ans = 0;
        if(n==0)
            return 1;
        while(n!=0){
            int bit = n&1;
            ans = ans|((bit==1?0:1)<<indx); 
            n=n>>1;
            indx++;
        }
        return ans;
    }
}
