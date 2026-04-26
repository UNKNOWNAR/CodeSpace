/*Write a C program to find first and last digit of a number.*/
/*Write a C program to find sum of first and last digit of a number.*/
/*Write a C program to swap first and last digits of a number.*/
/*Write a C program to calculate sum of digits of a number.
Write a C program to calculate product of digits of a number.*/
import java.io.*;
public class Digit
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Number:-");
       int n = Integer.parseInt(dis.readLine());
       int m = n, f=0, l=0, i=0, sum=0,product=1 ;
       
       while(n>0)
       {
           int r = n%10;
           sum = sum + r;
           product = product * r;
           i++;
           if (n<10)
           {
                System.out.println( r+" is the first digit of the number " +m);
                f=r;
           }
           else if(m==n)
           {
               System.out.println(r+" is the last digit of the number " +m);
               l=r;
            }
       n=n/10;
    }
    System.out.println("Sum of first and last digit of "+m+" is "+(f+l));
    int d = (int) (Math.pow(10,(i-1)));
    n = m  - ((d*f) + l);
    n = n + (d*l) + f;
    System.out.println("Number after swapping first and last digit is "+n);
    System.out.println("Sum of digits"+sum);
    System.out.println("Product of digits"+product);
}
}
