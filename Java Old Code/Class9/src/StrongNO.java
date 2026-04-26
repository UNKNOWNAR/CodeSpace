/*Write a C program to check whether a number is Strong number or not.*/
import java.io.*;
public class StrongNO
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter the Number:-");
       int n = Integer.parseInt(dis.readLine());
       int m = n;
       int sum = 0;
       while(n>0)
       {
           int r = n%10;
           int b= 1;
           int i = 1;
           while (i <= r)
           {
               b = b* i;
               i++;
           }
           sum = sum + b;
           n=n/10;
       }
       System.out.println((sum==m)?m+" is a strong number":m+" is not a strong number");
    }
}
