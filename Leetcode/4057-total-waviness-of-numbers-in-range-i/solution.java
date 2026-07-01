class Solution {
    public int totalWaviness(int num1, int num2) {
        int count = 0;
        for(int i=num1;i<=num2;i++)
            count += getWaviness(i);
        return count;
    }
    private int getWaviness(int n){
        if(n<100)   return 0;
        int count = 0;
        int prev=n%10;
        n/=10;
        int curr=n%10;
        n/= 10;
        while(n>0){
            int next = n % 10;
            if(curr>next&&curr>prev)
                count++;
            if(next>curr&&prev>curr)
                count++;
            prev = curr;
            curr = next;
            n/=10;
        }
        return count;
    }
}
