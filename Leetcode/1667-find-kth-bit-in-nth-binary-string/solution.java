class Solution {
    public char findKthBit(int n, int k) {
        if(n==1)
            return '0';
        int size = (1<<n)-1;
        if(k==((size+1)>>1))
            return '1';
        if(k<((size+1)>>1))
            return findKthBit(n-1,k);
        else
            return findKthBit(n-1,size-k+1)=='0'?'1':'0';
    }
}
