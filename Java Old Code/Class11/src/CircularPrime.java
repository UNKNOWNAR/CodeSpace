import java.util.*;
public class CircularPrime
{
    boolean prime(int n)
    {
        int f = 0;
        for(int i=2;i<n;i++)
            f+=(n%i==0)?1:0;
        if(f==0)
            return true;
        return false;
    }
    int factorial(int n)
    {
        int f=1;
        while(n>1)
        {
            f*=n;
            n--;
        }
        return f;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        CircularPrime ob = new CircularPrime();
        System.out.println("Enter A Number:- ");
        int n= sc.nextInt();
        int d = 0;
        int temp=n;
        while(temp!=0)
        {
            temp/=10;
            d++;
        }
        int c = ob.factorial(d); 
        int num[] = new int[d];
        int c1[] = new int[d];
        int c2[] = new int[d];
        temp=n;
        int i  = d-1;
        d=0;
        while(temp!=0)
        {
            num[d]=temp%10;
            temp/=10;
            d++;
            c1[i] = d;
            i--;
        }
        for(int j=0;j<c;j++)
        {
            int n1 = 0;
            for(i=0;i<d;i++)
            {
                 n1 = n1*10+num[c2[i]];
                 
            }
        }
    }
}