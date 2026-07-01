class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0||k%5==0)
            return -1;
        int n = 1;
        int counter = 1;
        int remainder = 1;
        while(remainder%k!=0){
            remainder = (remainder*10+1)%k;
            counter++;
        }
        return counter;
    }
}
