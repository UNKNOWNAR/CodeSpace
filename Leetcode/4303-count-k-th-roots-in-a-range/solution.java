class Solution {
    public int countKthRoots(int l, int r, int k) {
        if(k==1)
            return r-l+1;
        int l_k = getFloorRoot(l-1,k);
        int r_k = getFloorRoot(r,k);
        return r_k-l_k;
    }
    private int getFloorRoot(int num,int k){
        if(num<=0) return num;
        int guess = (int)Math.pow(num,1.0/k);
        while(Math.pow(guess,k)>num)
            guess--;
        while(Math.pow(guess+1,k)<=num) 
            guess++;
        return guess;
    }
}
