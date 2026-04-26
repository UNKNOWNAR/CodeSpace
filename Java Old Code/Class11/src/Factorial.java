import java.util.*;
public class Factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:-");
        int n = sc.nextInt();
        Factorial ob = new Factorial();
        System.out.println("Factorial of "+n+" is:- "+ob.factorial(n));
    }  
    int factorial(int x)
    {
        if(x==1)
        return x;
        else
        return x*factorial(x-1);
    }
}