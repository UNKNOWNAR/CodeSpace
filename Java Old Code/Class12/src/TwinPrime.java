import java.util.*;
public class TwinPrime {
    boolean isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwinPrime prime = new TwinPrime();
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        if(n<0) {
            System.out.println("Number is Negative so Twin Prime not Possible");
            System.exit(0);
        }
        int counter = (n%2==0)?n+1:n+2;
        int i = 0;
        while(counter>0)
        {
            if(i%2==0)
            {
                if(!(prime.isPrime(counter)&& prime.isPrime(counter+2))) {
                    System.out.println("Twin Prime Numbers:- " + counter + " and " + (counter + 2));
                    System.exit(0);
                }
                i++;
                counter = n - (i/2)*2;
            }
            else
            {
                if(!(prime.isPrime(counter)&& prime.isPrime(counter-2))) {
                    System.out.println("Twin Prime Numbers:- " + counter + " and " + (counter - 2));
                    System.exit(0);
                }
                i++;
                counter = n + (i/2)*2;
            }
            System.out.println(counter);
        }
        System.out.println("No Twin Prime Numbers Found");
    }
}