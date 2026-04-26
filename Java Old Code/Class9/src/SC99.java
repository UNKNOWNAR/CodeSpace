/* Write a Program to Print the factorials of any ten numbers
  Sample Input:8
  Factorial of 8 = 40320
  Factorial of 11 = 39916800
 */
import java.io.*;
public class SC99
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter THe Starting Number");
       int n = Integer.parseInt(dis.readLine());
       int i=n;
       while(i<=(n+9))
       {
           int a=i;
           int b= 1;
           System.out.print("Factorial of "+a  );     
           while (a>0)
           {
               b = b* a;
               a--;
           }
           System.out.print(" is "+b);
           System.out.println();
           i++;
       }
    }
}