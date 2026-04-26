import java.util.*;
public class NonIdentical
{
    public static void  mian(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int n = sc.nextInt();
        System.out.println("Enter a Number:-");
        int n1=  sc.nextInt();
        int c = (n<n1)?n:n1;
        while(c!=0)
        {
            int x= n%10;
            int y = n1%10;
            if(x!=y)
                System.out.println(x+" is not identical to "+y);
            n/=10;
            n1/=10;
            c/=10;
        }
    }
}