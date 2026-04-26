import java.util.*;
public class BouncyNo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:-");
        int n = sc.nextInt();
        int p = n%10;
        n/=10;
        int rev=p;
        while(n!=0)
        {
            int x = n%10;
            rev=rev*10+x;
            if(x>p)
            {
                System.out.println("Number is not a Bouncy Number");
                
            }
            n=n/10;
            p=x;
        }
        p = rev%10;
        System.out.println(rev);
        n/=10;
        while(rev!=0)
        {
            int x = rev%10;
            if(x>p)
            {
                System.out.println("Number is not a Bouncy Number");
                System.exit(0);
            }
            p=x;
        }
    }  
}