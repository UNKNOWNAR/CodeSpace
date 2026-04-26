import java.util.*;
public class Enrip
{
    int n;
    int rev;
    int f;
    Enrip(int nn)
    {
        n = nn;
        rev = 0;
        f = 2;
    }
    int isprime(int x)
    {
        int i=0;
        while(f<x)
        {
            if(x%f==0)
                i++;
            f++;
        }
        if(i==0)
            return 0;
        else 
            return 1;
    }
    void isEnrip()
    {
        int  t = n;
        while(t!=0)
        {
            rev = rev*10+t%10;
            t/=10;
        }
        if(isprime(n)+isprime(rev)==0)
            System.out.println(n+" is a Enrip Number");
        else 
            System.out.println(n+" is not a Enrip Number");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int n = sc.nextInt();
        Enrip ob = new Enrip(n);
        ob.isEnrip();
    }
}  