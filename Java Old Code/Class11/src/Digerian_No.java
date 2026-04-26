import java.util.*;
public class Digerian_No
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  temp = n, rev= 0;
        while(n!=0)
        {
            rev = (n%10)+rev*10;
            n/=10;
        }
        n=rev;
        double sum = 0.0,i=1.0;
        while(n!=0)
        {
            sum += Math.pow((n%10),i);
            n/=10;
            i++;
        }
        if(temp==sum)
            System.out.println("It is a Digerian No");
        else 
             System.out.println("It is not  a Digerian No");
    }
}