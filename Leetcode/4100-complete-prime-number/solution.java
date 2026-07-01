class Solution {
    public boolean isPrime(int n){
        if(n==1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public boolean completePrime(int num) {
        int suffix = 0;
        int temp = num;
        int nod = 0;
        while(temp!=0){
            suffix += temp%10*(int)(Math.pow(10,nod));
            System.out.println(suffix);
            temp/=10;
            if(!isPrime(suffix))
                return false;
            nod++;
        }
        temp = num;
        int preffix = 0;
        while(temp!=0){
            nod--;
            preffix = preffix*10+ temp/(int)(Math.pow(10,nod));
            System.out.println(preffix);
            temp = temp - (temp/(int)(Math.pow(10,nod)))*(int)(Math.pow(10,nod));
            if(!isPrime(preffix))
                return false;
        }
        return true;
    }
}
