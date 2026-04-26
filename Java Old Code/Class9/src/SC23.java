/*Write a program to accept a number and check whether it is a 'Spy Number' or not. (A number is spy if the sum of its digits equals the product of its digits.)
Example: Sample Input: 1124
Sum of the digits = 1 + 1 + 2 + 4 = 8
Product of the digits = 1*1*2*4 = 8*/
import java.io.*;
public class SC23
{
    public static void main ( String args [])throws IOException
    { 
       DataInputStream dis = new DataInputStream(System.in);
       System.out.println("Enter Number:-");
       int n = Integer.parseInt(dis.readLine());
       int sum=0,a=n,product=1;
       while(n>0)
       {
           sum += (n%10);
           product *= (n%10);
           n =n / 10;
       }
       System.out.println((sum==product)?a+"is a spy number":a+" is not a spy number");
    }
}