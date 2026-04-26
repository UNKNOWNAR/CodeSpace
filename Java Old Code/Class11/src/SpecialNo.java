import java.util.*;
public class SpecialNo
{
    int n;
    SpecialNo()
    {
        n=0;
    }
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        n = sc.nextInt();
    }
    int factorial(int x)
    {
        int p = 1;
        if(x>1)
            p=x*factorial(x-1);       
        return p;
    }
    boolean isSpecial()
    {
        int temp=n;
        int sum = 0;
        while(n!=0)
        {
            sum += factorial(n%10);
            n/=10;
        }
        n=temp;
        if(sum==temp)
            return true;
        else
            return false;
    }
    void display()
    {
        read();
        if(isSpecial())
            System.out.println(n+" is a Special Number");
        else
            System.out.println(n+" is not a Special Number");
    }
}