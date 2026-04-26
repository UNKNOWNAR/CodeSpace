import java.util.*;
public class Special
{
    int n;
    Special()
    {
        n=0;
    }
    void Special(int a)
    {
        n=a;
    }
    void sum()
    {
        int t = n;
        int sum = 0;
        while(t>0)
        {
            sum=t%10;
            t/=10;
        }
        sum += n%10;    
        System.out.println(sum+" is sum of the last and first digit of the series");
    }
    void isSpecial()
    {
        int t = n,sum=0;
        while(t!=0)
        {
            int l = t%10;
            int a  = 1;
            for(int i=2;i<=l;i++)
                a *=i;
            sum+=a;
            t/=10;
        }
        if(n==sum)
            System.out.println(n+" is a special number");
        else
            System.out.println(n+" is not a special number");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int n = sc.nextInt();
        Special ob = new Special();
        ob.Special(n);
        ob.sum();
        ob.isSpecial();
    }
}