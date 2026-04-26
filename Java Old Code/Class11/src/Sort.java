import java.util.*;
public class Sort 
{
    int exponent(int n,int m)
    {
        if(m==1)
            return n;
        else
            return n*exponent(n,m-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:-");
        int n = sc.nextInt();
        int m = sc.nextInt();
        Sort ob = new Sort();
        System.out.println(ob.exponent(n,m));
    }
}