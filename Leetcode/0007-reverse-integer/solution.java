class Solution {
    public int reverse(int x) {
        long rev = 0;
        long num = Math.abs((long)x);
        while(num!=0){
            rev = rev*10+num%10;
            num/=10;
        }
        if (rev > Integer.MAX_VALUE) {
            return 0;
        }
        if(x<0)
            return -1*(int)rev;
        return (int)rev;
    }
}
