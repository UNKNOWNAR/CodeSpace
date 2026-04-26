/*Write a program to input a number. Calculate and display the factorial of each digit.
 Sample Input : 365
 Factorial of 5 = 120
 Factorial of 6 = 720
 Factorial of 3 = 6
 */
import java.io.*;
public class SC910
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("ENTER A NUMBER");
       int a = Integer.parseInt(dis.readLine());
       int i =0,n=0;
       while(a>0)
       {
           n = a % 10;
           int b= 1;
           System.out.print("Factorial of "+n  );     
           while (n>0)
           {
               b = b* n;
               n--;
           }
           System.out.println(" is "+b);
           a = a / 10;
        }
    }
}