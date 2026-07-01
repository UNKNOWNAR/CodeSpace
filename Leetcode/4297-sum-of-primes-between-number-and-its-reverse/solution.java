class Solution {
    private boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int temp = n;
        int rev = 0;
        while(temp!=0){
            rev = rev*10+temp%10;
            temp/=10;
        }
        int low = Math.min(rev,n);
        int high = Math.max(rev,n);
        int sum = 0;
        for(int i=low;i<=high;i++){
            if(isPrime(i))
                sum += i;
        }
        return sum;
    }
}
