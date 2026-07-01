class Solution {
    public boolean validDigit(int n, int x) {
        int temp = n;
        int count = 0;
        while(temp!=0){
            if(temp%10==x)
                count++;
            temp = temp/10;
            if(temp>0)
                n = temp;
        }
        if(n==x&&x!=0)
            return false;
        if(count==0)
            return false;
        return true;
    }
}
