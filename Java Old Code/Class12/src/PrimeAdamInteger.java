import java.util.*;
public class PrimeAdamInteger {
    boolean isPrime(int n)
    {
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                f++;
        }
        if(f==0)
            return true;
        else
            return false;
    }
    int Reverse(int n)
    {
        int rev = 0;
        while(n>0)
        {
            rev = rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int min=0,max=0;
        while(min>=max)
        {
            System.out.println("Enter The Min Value:-");
            min = sc.nextInt();
            System.out.println("Enter The Max Value:-");
            max = sc.nextInt();
            if(min>=max)
                System.out.println("Invalid Input Input again");
        }
        PrimeAdamInteger ob = new PrimeAdamInteger();
        while(min<=max) {
            int rev = ob.Reverse(min);
            if (min * min == ob.Reverse(rev*rev) && ob.isPrime(min)) {
                System.out.println(min + " is a PrimeAdamInteger");
            }
            min++;
        }
    }
}